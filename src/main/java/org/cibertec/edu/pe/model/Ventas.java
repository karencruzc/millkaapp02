package org.cibertec.edu.pe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String IdVenta;
    private String IdCliente;
    private String FechaVenta;
    private double MontoTotal;
    private char Estado;
    
	public Ventas() {
	
	}

	public Ventas(String idVenta, String idCliente, String fechaVenta, double montoTotal, char estado) {
		super();
		IdVenta = idVenta;
		IdCliente = idCliente;
		FechaVenta = fechaVenta;
		MontoTotal = montoTotal;
		Estado = estado;
	}

	public String getIdVenta() {
		return IdVenta;
	}

	public void setIdVenta(String idVenta) {
		IdVenta = idVenta;
	}

	public String getIdCliente() {
		return IdCliente;
	}

	public void setIdCliente(String idCliente) {
		IdCliente = idCliente;
	}

	public String getFechaVenta() {
		return FechaVenta;
	}

	public void setFechaVenta(String fechaVenta) {
		FechaVenta = fechaVenta;
	}

	public double getMontoTotal() {
		return MontoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		MontoTotal = montoTotal;
	}

	public char getEstado() {
		return Estado;
	}

	public void setEstado(char estado) {
		Estado = estado;
	}
	
}
