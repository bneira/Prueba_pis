package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: EstadoPedido
 *
 */
@Entity
@Table(name="WEBESTADOSPEDIDO")
public class EstadoPedido implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public EstadoPedido() {
		super();
	}
	
	@Id
	@Column(name = "IDESTADOPEDIDO", nullable = false)
	private String idEstadoPedido;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;

	public String getIdEstadoPedido() {
		return idEstadoPedido;
	}
	public void setIdEstadoPedido(String idEstadoPedido) {
		this.idEstadoPedido = idEstadoPedido;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public char getEliminado() {
		return eliminado;
	}
	public void setEliminado(char eliminado) {
		this.eliminado = eliminado;
	}
	
	
   
}
