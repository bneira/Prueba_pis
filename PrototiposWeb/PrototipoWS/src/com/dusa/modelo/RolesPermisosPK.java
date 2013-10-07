package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.PrimaryKeyJoinColumn;

@Embeddable
public class RolesPermisosPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@PrimaryKeyJoinColumn(name = "IDROL")
	private String idRol;

	@PrimaryKeyJoinColumn(name = "IDPERMISO")
	private String idPermiso;
	
	
	public int hashCode() {
        return (int) (idRol.hashCode() + idPermiso.hashCode());
    }

    public boolean equals(Object obj) {
        if(obj == this) 
        	return true;
        else if(!(obj instanceof RolesPermisosPK)) 
        	return false;
		else
			return ((RolesPermisosPK) obj).idRol == idRol &&
			        ((RolesPermisosPK) obj).idPermiso == idPermiso;
    } 

}
