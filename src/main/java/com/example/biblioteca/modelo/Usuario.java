package com.example.biblioteca.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
public
@Data @AllArgsConstructor @NoArgsConstructor
class Usuario implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String password;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
	private List<Libro> libro;
	
}
