package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Permiso
 *
 */
@Entity
@Table(name="WEBPERMISOS")
public class Permiso implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Permiso() {
		super();
	}
	
	@Id
	@Column(name = "IDPERMISO", nullable = false)
	private String idPermiso;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;

	public String getIdPermiso() {
		return idPermiso;
	}
	public void setIdPermiso(String idPermiso) {
		this.idPermiso = idPermiso;
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
