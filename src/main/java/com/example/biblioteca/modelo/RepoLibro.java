package com.example.biblioteca.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.modelo.Libro;

@Repository
public interface RepoLibro extends JpaRepository<Libro, Long> {

}
