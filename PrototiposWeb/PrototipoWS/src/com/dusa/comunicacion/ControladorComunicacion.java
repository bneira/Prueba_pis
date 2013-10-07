package com.dusa.comunicacion;



import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.dusa.logica.Fabrica;
import com.dusa.logica.IControladorUsuario;
import com.dusa.logica.ManejadorUsuario;
import com.dusa.modelo.Usuario;
import com.dusa.modelo.datatypes.MensajeError;


@WebService
public class ControladorComunicacion {

	@WebMethod
	public MensajeError altaUsuario(@WebParam(name = "user") String user){
		IControladorUsuario iu = Fabrica.getInstance().getIUsuario();
		
		MensajeError msj = iu.altaUsuario(user);
		
		return msj;
			
		
	}
	
	@WebMethod
	public Usuario iniciarSesion(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass){
		IControladorUsuario iu = Fabrica.getInstance().getIUsuario();
		
		//String usuario = iu.inicioSesion(user, pass);
		
		ManejadorUsuario man = ManejadorUsuario.getInstance();
		Usuario usu = man.find(user);
		
		return usu;
		
		
				
		
	}
	
	
}
