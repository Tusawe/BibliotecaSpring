package com.example.biblioteca.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public
class Usuario implements Serializable {
	@Id 
	private Long id;
	private String username;
	private String password;
	private String dni;
	private String nombre;
	private String apellido;
	private String email;
	
	// @OneToMany(mappedBy="usuario")
	// private List<Reserva> reservas;
	
	public Usuario(Long id, String username, String password, String email,
			String dni, String nombre, String apellido) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}
	
	public Usuario() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
