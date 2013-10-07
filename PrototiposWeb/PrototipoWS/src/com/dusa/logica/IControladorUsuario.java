package com.dusa.logica;

import java.util.List;

import com.dusa.modelo.Farmacia;
import com.dusa.modelo.datatypes.DataResultObtFormPago;
import com.dusa.modelo.datatypes.DataResultObtRepartos;
import com.dusa.modelo.datatypes.MensajeError;


public interface IControladorUsuario {

	public List<Farmacia> iniciarAltaUsuarioFarmacia();
	
	public MensajeError altaUsuario(String usuario);
	
	public MensajeError altaUsuarioAdminDUSA(String usuario, String clave, String nombre, String email);
	
	public MensajeError altaUsuarioAdminFarmacia(String usuario, String clave, String nombre, String email, String telefono, int farmacia, int cantWeb);
	
	public MensajeError altaUsuarioFarmaciaPorAdmin(String usuario, String clave, String nombre, String email, String telefono, String userAdmin);
	
	public MensajeError altaUsuarioFarmaciaPorDUSA(String usuario, String clave, String nombre, String email, String telefono, int farmacia);
	
	public String inicioSesion(String usr, String password); 
	
	public DataResultObtRepartos obtenerRepartosUsuario(String user);
	
	public DataResultObtFormPago obtenerFormasPagoUsuario(String user);

}
