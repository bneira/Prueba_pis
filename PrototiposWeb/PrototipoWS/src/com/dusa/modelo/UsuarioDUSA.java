package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioDUSA
 *
 */
@Entity
@Table(name="WEBUSUARIOS")
public class UsuarioDUSA extends Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;

	// **** CONSTRUCTORES ****
	public UsuarioDUSA() {
		super();
	}
	
	public UsuarioDUSA(String usuario, String clave, String nombre, String email){
		setUsuario(usuario);
		setClave(clave);
		setNombre(nombre);
		setEmail(email);
		setEliminado(ConstantesDominio.NO_ELIMINADO);
		setHabilitado(ConstantesDominio.USUARIO_HABILITADO);
		setLogueado(ConstantesDominio.USUARIO_NO_LOGUEADO);
	}
   
}
