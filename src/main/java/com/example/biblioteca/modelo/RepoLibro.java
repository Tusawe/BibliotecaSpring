package com.example.biblioteca.modelo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jdbc.repository.query.Query;

import com.example.biblioteca.modelo.Libro;
import com.example.biblioteca.modelo.Usuario;

@Repository
public interface RepoLibro extends JpaRepository<Libro, Long> {
	
	@Query("SELECT l FROM libro l WHERE l.id_usuario=?1")
	List<Usuario> findByUsuarioId(Long usuarioId);
	
}
