package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioAdminFarmacia
 *
 */
@Entity
@Table(name="WEBUSUARIOS")
public class UsuarioAdminFarmacia extends UsuarioFarmacia implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public UsuarioAdminFarmacia() {
		super();
	}
	
	public UsuarioAdminFarmacia(String usuario, String clave, String nombre, String email, String telefono){
		setUsuario(usuario);
		setClave(clave);
		setNombre(nombre);
		setEmail(email);
		setTelefono(telefono);
		setEliminado(ConstantesDominio.NO_ELIMINADO);
		setHabilitado(ConstantesDominio.USUARIO_HABILITADO);
		setLogueado(ConstantesDominio.USUARIO_NO_LOGUEADO);		
	}
	

}
