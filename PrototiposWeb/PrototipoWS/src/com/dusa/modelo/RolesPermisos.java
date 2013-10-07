package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RolesPermisos
 *
 */
@Entity
@Table(name="WEBROLESPERMISOS")
public class RolesPermisos implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public RolesPermisos() {
		super();
	}
	
	@EmbeddedId
    private RolesPermisosPK rolesPermisosPK;
	
	@PrimaryKeyJoinColumn(name="IDROL",referencedColumnName = "IDROL")
	private Rol rol;
	
	@PrimaryKeyJoinColumn(name="IDPERMISO",referencedColumnName = "IDPERMISO")
	private Permiso permiso;
	
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public Permiso getPermiso() {
		return permiso;
	}
	public void setPermiso(Permiso permiso) {
		this.permiso = permiso;
	}
   
}
