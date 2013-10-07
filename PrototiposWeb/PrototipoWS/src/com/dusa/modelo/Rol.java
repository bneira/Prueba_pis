package com.dusa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Rol
 *
 */
@Entity
@Table(name="WEBROLES")
public class Rol implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Rol() {
		super();
		this.setEliminado('N');
	}
	
	@Id
	@Column(name = "IDROL", nullable = false)
	private String idRol;
	
	@Column(name = "DESCRIPCION", nullable = false)
	private String descripcion;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;	
	
	@ManyToMany (fetch = FetchType.LAZY)
	@JoinTable(
		      name="WEBROLESPERMISOS",
		      joinColumns={@JoinColumn(name="IDROL", referencedColumnName="IDROL")},
		      inverseJoinColumns={@JoinColumn(name="IDPERMISO", referencedColumnName="IDPERMISO")})
	private List<Permiso> permisos;

	public String getIdRol() {
		return idRol;
	}
	public void setIdRol(String idRol) {
		this.idRol = idRol;
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
	public List<Permiso> getPermisos() {
		return permisos;
	}
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}

	
   
}
