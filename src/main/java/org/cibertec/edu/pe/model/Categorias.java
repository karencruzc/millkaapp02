package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categoria")
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private String IdCategoria;
    private String Descripcion;
    private String Imagen;
    private char Estado;
    
	public Categorias() {
	}

	public Categorias(String idCategoria, String descripcion, String imagen, char estado) {
		super();
		IdCategoria = idCategoria;
		Descripcion = descripcion;
		Imagen = imagen;
		Estado = estado;
	}

	public String getIdCategoria() {
		return IdCategoria;
	}

	public void setIdCategoria(String idCategoria) {
		IdCategoria = idCategoria;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}
	
}
