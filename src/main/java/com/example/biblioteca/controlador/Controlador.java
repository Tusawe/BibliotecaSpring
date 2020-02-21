package com.example.biblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@GetMapping("/libro")
    public List<Libro> getAllLibros() {
        return repoLibro.findAll();
    }
	
}
