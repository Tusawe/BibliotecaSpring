package com.example.biblioteca.modelo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoUsuarios extends JpaRepository<Usuario, Long> {}
