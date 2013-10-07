package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RolesUsuarios
 *
 */
@Entity
@Table(name="WEBROLESUSUARIOS")
public class RolesUsuarios implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public RolesUsuarios() {
		super();
	}
	
	@EmbeddedId
    private RolesUsuariosPK rolesUsuariosPK;	
	
	@JoinColumn(name="USUARIO",referencedColumnName = "USUARIO")
	private Usuario usuario;
	
	
	@JoinColumn(name="IDROL",referencedColumnName = "IDROL")
	private Rol rol;
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}
   
}
