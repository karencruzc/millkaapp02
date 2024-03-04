package org.cibertec.edu.pe.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Carrito {
	
	private String IdProducto;
    private int Cantidad;

    
	public Carrito() {
	}


	public Carrito(String idProducto, int cantidad) {
		super();
		IdProducto = idProducto;
		Cantidad = cantidad;
	}


	public String getIdProducto() {
		return IdProducto;
	}


	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}


	public int getCantidad() {
		return Cantidad;
	}


	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}
	
	    
}
