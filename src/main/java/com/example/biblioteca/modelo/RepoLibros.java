package com.example.biblioteca.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Query;

@Repository
public interface RepoLibros extends JpaRepository<Libro, Long> {

	//@Query("SELECT * FROM libro l WHERE l.id_usuario=?1")
	//List<Libro> findByIdUsuario(Long id_usuario);
	
}
