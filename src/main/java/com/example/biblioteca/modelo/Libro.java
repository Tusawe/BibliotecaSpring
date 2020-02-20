package com.example.biblioteca.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Libro implements Serializable {
	@Id 
	private Long id;
	private Long id_usuario;
	private String isbn;
	private String titulo;
	private String editorial;
	private int nPaginas;
	
	public Libro(Long id, Long id_usuario, String isbn, String titulo, String editorial, int nPaginas) {
		super();
		this.id = id;
		this.id_usuario = id_usuario;
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

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}
	
}