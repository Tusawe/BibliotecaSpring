package com.example.biblioteca.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Libro implements Serializable {
	@Id 
	private Long id;
	private Long idUsuario;
	private String isbn;
	private String titulo;
	private String editorial;
	private int nPaginas;
	
	public Libro(Long id, Long idUsuario, String isbn, String titulo, String editorial, int nPaginas) {
		super();
		this.id = id;
		this.idUsuario = idUsuario;
		this.isbn = isbn;
		this.titulo = titulo;
		this.editorial = editorial;
		this.nPaginas = nPaginas;
	}

	public Libro() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public int getnPaginas() {
		return nPaginas;
	}

	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}	
	
}