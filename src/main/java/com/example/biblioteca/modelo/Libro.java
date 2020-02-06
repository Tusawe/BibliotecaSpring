package com.example.biblioteca.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public
class Libro implements Serializable {
	@Id 
	private Long id;
	private String username;
	private String password;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
}