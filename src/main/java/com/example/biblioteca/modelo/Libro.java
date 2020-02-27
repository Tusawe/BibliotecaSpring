package com.example.biblioteca.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
public
@Data @NoArgsConstructor @ AllArgsConstructor
class Libro implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String isbn;
	private String titulo;
	private String editorial;
	private int nPaginas;
	
	@JoinColumn(name = "usuario", 
			referencedColumnName = "id", 
			nullable = false)     
	@ManyToOne(optional = false)     
	@JsonBackReference

	private Usuario usuario;
	
}