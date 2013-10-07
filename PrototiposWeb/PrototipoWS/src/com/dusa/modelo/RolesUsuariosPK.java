package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RolesUsuariosPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "IDROL", nullable = false,updatable = false, insertable = false)
	private String idRol;

	@Column(name = "USUARIO", nullable = false,updatable = false, insertable = false)
	private String idUsuario;
	
	
	public int hashCode() {
        return (int) (idRol.hashCode() + idUsuario.hashCode());
    }

    public boolean equals(Object obj) {
        if(obj == this) 
        	return true;
        else if(!(obj instanceof RolesUsuariosPK)) 
        	return false;
		else
			return ((RolesUsuariosPK) obj).idRol == idRol &&
			        ((RolesUsuariosPK) obj).idUsuario == idUsuario;
    } 

}
