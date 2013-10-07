package com.dusa.modelo.datatypes;

import java.io.Serializable;

public class DataBackOrder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int cantidad;
	
	private int nro_producto;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getNro_producto() {
		return nro_producto;
	}

	public void setNro_producto(int nro_producto) {
		this.nro_producto = nro_producto;
	}
	
	

}
