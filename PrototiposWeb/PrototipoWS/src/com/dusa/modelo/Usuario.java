package com.dusa.modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
@Table(name="WEBUSUARIOS")
public abstract class Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}
	
	@Id
	@Column(name = "USUARIO", nullable = false)
	protected String usuario;
	
	@Column(name = "CLAVE", nullable = false)
	protected String clave;
	
	@Column(name = "EMAIL", nullable = true)
	protected String email;
	
	@Column(name = "NOMBRE", nullable = true)
	protected String nombre;
	
	@Column(name = "LOGUEADO", nullable = false)
	private char logueado;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;	
	
	@Column(name = "HABILITADO", nullable = true)
	private char habilitado;
	
	public char getEliminado() {
		return eliminado;
	}
	public void setEliminado(char eliminado) {
		this.eliminado = eliminado;
	}

	@ManyToMany (fetch = FetchType.EAGER)
	@JoinTable(
		      name="WEBROLESUSUARIOS",
		      joinColumns={@JoinColumn(name="USUARIO", referencedColumnName="USUARIO")},
		      inverseJoinColumns={@JoinColumn(name="IDROL", referencedColumnName="IDROL")})
	private List<Rol> roles;	

	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public char getLogueado() {
		return logueado;
	}
	public void setLogueado(char logueado) {
		this.logueado = logueado;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(char habilitado) {
		this.habilitado = habilitado;
	}

	
	
   
}
