package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Producto
 *
 */
@Entity
@Table(name="STOCK")
public class Producto implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Producto() {
		super();
	}
	
	@Id
	@Column(name = "NRO_ARTICULO", nullable = false)
	private int nroArticulo;	
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@JoinColumn(name = "LAB", nullable = false)
	private Laboratorio laboratorio;
	
	@Column(name = "HABILITADO", nullable = false)
	private char habilitado;
	
	@Column(name = "EXIST_SUPUESTA", nullable = false)
	private int stock;
	
	@Column(name = "PRECIO_VENTA", nullable = false)
	private double precio;	
	
	@Column(name = "PRECIO_CONTADO", nullable = false)
	private double precioContado;
	
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public double getPrecioContado() {
		return precioContado;
	}

	public void setPrecioContado(double precioContado) {
		this.precioContado = precioContado;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public char getHabilitado() {
		return habilitado;
	}

	public void setHabilitado(char habilitado) {
		this.habilitado = habilitado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getNroArticulo() {
		return nroArticulo;
	}
	
	public void setNroArticulo(int nroArticulo) {
		this.nroArticulo = nroArticulo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
  
}
