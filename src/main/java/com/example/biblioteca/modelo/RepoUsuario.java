package com.example.biblioteca.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.biblioteca.modelo.Usuario;

@Repository
public interface RepoUsuario extends JpaRepository<Usuario, Long> {

}
