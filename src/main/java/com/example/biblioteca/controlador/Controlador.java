package com.example.biblioteca.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.modelo.RepoLibros;
import com.example.biblioteca.modelo.RepoUsuarios;
import com.example.biblioteca.modelo.Usuario;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class Controlador {
	@Autowired
    RepoUsuarios repoUsuario;
	
	@Autowired
    RepoLibros repoLibro;
	
	@GetMapping("/usuario")
    public List<Usuario> getAllUsuarios() {
        return repoUsuario.findAll();
    }
	
	@GetMapping("/libro")
    public List<Libro> getAllLibros() {
        return repoLibro.findAll();
    }
	
}
