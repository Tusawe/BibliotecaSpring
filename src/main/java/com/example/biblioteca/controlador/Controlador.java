package com.example.biblioteca.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.modelo.RepoLibro;
import com.example.biblioteca.modelo.RepoUsuario;
import com.example.biblioteca.modelo.Usuario;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Controlador {
	@Autowired
    RepoUsuario repoUsuario;
	
	@Autowired
    RepoLibro repoLibro;
	
	@GetMapping("/usuario")
    public List<Usuario> getAllUsuarios() {
        return repoUsuario.findAll();
    }
	
	@GetMapping("/usuario/{id}")
    public Usuario getOneUsuarios(@PathVariable(value = "id") Long userId) {
    	Usuario usuario = repoUsuario.findById(userId).orElseThrow(
        		() -> new ResourceNotFoundException());
        return usuario;
    }
	
	@PostMapping(value="/usuario" , consumes={"application/json"} )
    @ResponseBody public Usuario createUsuario(@Valid @RequestBody Usuario usuario) {   
        return repoUsuario.save(usuario);
    }
	
	@DeleteMapping("/usuario/{id}")
    public Usuario deleteUsuario(@PathVariable(value = "id") Long userId) {
        Usuario usuario = repoUsuario.findById(userId).orElseThrow(
        		() -> new ResourceNotFoundException());
        repoUsuario.delete(usuario);
        return usuario;
    }
	
	@PutMapping(value="/usuario/{id}", consumes={"application/json"})
    @ResponseBody public Usuario updateUsuario(
			@PathVariable(value = "id") Long userId, 
			@Valid @RequestBody Usuario usuario) {
	    
	    Usuario updated_user = repoUsuario.findById(userId).orElseThrow(() -> new ResourceNotFoundException());
	    updated_user.setUsername(usuario.getUsername());
	    updated_user.setPassword(usuario.getPassword());
	    return repoUsuario.save(updated_user);
    }
	
	@GetMapping("/libro")
    public List<Libro> getAllLibros() {
        return repoLibro.findAll();
    }
	
	@GetMapping("/libro/{id}")
    public Libro getOneLibros(@PathVariable(value = "id") Long bookId) {
    	Libro libro = repoLibro.findById(bookId).orElseThrow(
        		() -> new ResourceNotFoundException());
        return libro;
    }
	
	@GetMapping("/usuario/{id}/libro")
    public List<Libro> findLibrosUsuario(@PathVariable(value = "id") Long userId) {
        Usuario usuario = repoUsuario.findById(userId).orElseThrow(
        		() -> new ResourceNotFoundException());
        
        return repoLibro.findByUsuarioId(usuario.getId());
    }
	
	@GetMapping("/usuario/{usu}/libro/{lib}")
    public Libro findLibroUsuario(
    			@PathVariable(value = "usu") Long userId,
    			@PathVariable(value = "lib") Long bookId) {
        Libro libro = repoLibro.findById(bookId).orElseThrow(
        		()->new ResourceNotFoundException());
        return libro;
    }
	
	@PostMapping(value="/usuario/{usu}/libro",  consumes={"application/json"})
    @ResponseBody 
    public Libro createLibroUsuario(
    			@Valid @RequestBody Libro libro,
    			@PathVariable(value = "usu") Long userId) {
        Usuario usuario = repoUsuario.findById(userId).orElseThrow(
        		()->new ResourceNotFoundException());
        libro.setUsuario(usuario);
        repoLibro.save(libro);
        return libro;
    }
	
	@DeleteMapping("/libro/{id}")
    public Libro deleteLibro(@PathVariable(value = "id") Long bookId) {
        Libro libro = repoLibro.findById(bookId).orElseThrow(
        		() -> new ResourceNotFoundException());
        repoLibro.delete(libro);
        return libro;
    }
	
	 @DeleteMapping("/usuario/{usu}/libro/{lib}")
	    public Libro deleteLibroUsuario(
	    			@PathVariable(value = "usu") Long userId,
	    			@PathVariable(value = "lib") Long bookId) {
	        Libro libro = repoLibro.findById(bookId).orElseThrow(
	        		()->new ResourceNotFoundException() );
	        Usuario usuario = repoUsuario.findById(userId).orElseThrow(
	        		()->new ResourceNotFoundException() );
	        repoLibro.delete(libro);
	        return libro;
	    }  
	
	 @PutMapping(value="/usuario/{usu}/libro/{lib}", consumes={"application/json"})
	    @ResponseBody
	    public Libro updateLibroUsuario(
	    			@Valid @RequestBody Libro libro,
	    			@PathVariable(value = "usu") Long userId,
	    			@PathVariable(value = "lib") Long bookId) {
	        Libro old_libro = repoLibro.findById(bookId).orElseThrow(
	        		()->new ResourceNotFoundException());
	        Usuario usuario = repoUsuario.findById(userId).orElseThrow(
	        		()->new ResourceNotFoundException());
	        
	        old_libro.setIsbn(libro.getIsbn());
	        old_libro.setTitulo(libro.getTitulo());
	        old_libro.setEditorial(libro.getEditorial());
	        old_libro.setNPaginas(libro.getNPaginas());
	        old_libro.setUsuario(usuario);
	        
	        repoLibro.save(old_libro);
	        
	   		return old_libro;
	    }
	
}
