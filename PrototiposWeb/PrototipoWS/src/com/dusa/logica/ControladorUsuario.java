package com.dusa.logica;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.dusa.modelo.ConstantesDominio;
import com.dusa.modelo.Farmacia;
import com.dusa.modelo.Rol;
import com.dusa.modelo.Usuario;
import com.dusa.modelo.UsuarioAdminFarmacia;
import com.dusa.modelo.UsuarioDUSA;
import com.dusa.modelo.UsuarioFarmacia;
import com.dusa.modelo.datatypes.DataResultObtFormPago;
import com.dusa.modelo.datatypes.DataResultObtRepartos;
import com.dusa.modelo.datatypes.MensajeError;



public class ControladorUsuario implements IControladorUsuario{
	
	// Retorna ok si el usuario esta disponible
	public MensajeError altaUsuario(String usuario){
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		
		// Obtengo la instancia del manejador de usuarios
		ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
		
		if (mUsuario.member(usuario)){
			retorno = "El Usuario ya existe";
			codigo = -1;
		}
		
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		
		return msj;
	}

	// Retorno la lista de farmcias para asociar al usuario
	public List<Farmacia> iniciarAltaUsuarioFarmacia(){
		ManejadorFarmacia mFarmacia = ManejadorFarmacia.getInstance();
		return mFarmacia.values();
	}
	
	// Crea un usuario y lo agrega al manejador de usuarios
	public MensajeError altaUsuarioAdminDUSA(String usuario, String clave, String nombre, String email){
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		
		// Creo el usuario a partir de los datos
		UsuarioDUSA nuevoUsuario = new UsuarioDUSA(usuario, clave, nombre, email);
		
		// Obtengo la instancia del manejador y busco el rol correspondiente segun el nombre
		ManejadorRol mRol = ManejadorRol.getInstance();
		Rol rolUsuario = mRol.find(ConstantesDominio.ID_ROL_ADMIN_DUSA);
				
		if (rolUsuario != null){
		
			// Creo la lista de roles con el rol correspondiente
			List<Rol> roles = new ArrayList<Rol>();
			roles.add(rolUsuario);
			nuevoUsuario.setRoles(roles);
			try{
				// Obtengo la instancia del manejador de usuarios
				ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
				mUsuario.add(nuevoUsuario);
			} catch (Exception ex){
				retorno = "Error al insertar el usuario";
				codigo = -1;
			}
			
		} else {
			retorno = "Rol no encontrado";
			codigo = -2;
		}
		
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		return msj;
	}
	
	public MensajeError altaUsuarioAdminFarmacia(String usuario, String clave, String nombre, String email, String telefono, int farmacia, int cantWeb){
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();		
		
		// Chequeo que la farmacia este habilitada en el sistema de pedidos de DUSA
		ManejadorFarmacia mClientes = ManejadorFarmacia.getInstance();
		Farmacia cliente = mClientes.find(farmacia); 
		
		if (cliente.getHabilitado() == ConstantesDominio.FARMACIA_HABILITADA){
			// Chequeo que ya no exista un usuario administrador de la farmacia
			if(!cliente.existeAdmin()){
				// Chequeo que no haya llegado al limite de usuarios en la farmacia
				if (cliente.limiteUsuarios()){
					
					// Creo el usuario a partir de los datos
					UsuarioAdminFarmacia nuevoUsuario = new UsuarioAdminFarmacia(usuario, clave, nombre, email, telefono);
					
					// Obtengo la instancia del manejador y busco el rol correspondiente segun el nombre
					ManejadorRol mRol = ManejadorRol.getInstance();
					Rol rolUsuario = mRol.find(ConstantesDominio.ID_ROL_ADMIN_FARMACIA);
					
					if (rolUsuario != null){
					
						// Creo la lista de roles con el rol correspondiente
						List<Rol> roles = new ArrayList<Rol>();
						roles.add(rolUsuario);
						nuevoUsuario.setRoles(roles);
						
						try{
							// Obtengo la instancia del manejador de usuarios
							ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
							mUsuario.add(nuevoUsuario);
						} catch (Exception ex){
							retorno = "Error al insertar el usuario";
							codigo = -1;
						}					
					} else {
						retorno = "Rol no encontrado";
						codigo = -2;
					}
					
				} else{
					retorno = "Limite de usuarios de la farmacia alcanzado";
					codigo = -3;
				}
				
			} else{
				retorno = "Ya existe un usuario Administrador para la farmacia";
				codigo = -4;
			}
			
		} else {
			retorno = "Farmacia no habilitada";
			codigo = -5;
		}
		
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		return msj;
		
	}
	
	// Alta de usuario farmacia que realiza el administador de la farmacia
	public MensajeError altaUsuarioFarmaciaPorAdmin(String usuario, String clave, String nombre, String email, String telefono, String userAdmin){
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		
		// Obtengo la instancia del manejador de usuarios
		ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
		UsuarioAdminFarmacia adminFarmacia = (UsuarioAdminFarmacia)mUsuario.find(userAdmin);

		Farmacia f = adminFarmacia.getFarmacia();
		
		// Chequeo que no este en el limite de usuarios para la farmacia
		if (f.limiteUsuarios()){
			
			// Creo el usuario a partir de los datos
			UsuarioFarmacia nuevoUsuario = new UsuarioFarmacia(usuario, clave, nombre, email, telefono);
			
			// Obtengo la instancia del manejador y busco el rol correspondiente segun el nombre
			ManejadorRol mRol = ManejadorRol.getInstance();
			Rol rolUsuario = mRol.find(ConstantesDominio.ID_ROL_USUARIO_FARMACIA);
			
			if (rolUsuario != null){
							
				// Creo la lista de roles con el rol correspondiente
				List<Rol> roles = new ArrayList<Rol>();
				roles.add(rolUsuario);
				nuevoUsuario.setRoles(roles);
				nuevoUsuario.setFarmacia(f);
						
				try{
					mUsuario.add(nuevoUsuario);
				} catch (Exception ex){
					retorno = "Error al insertar el usuario";
					codigo = -1;
				}
			} else{
				retorno = "Rol no encontrado";
				codigo = -2;
			}

		} else {
			retorno = "Limite de usuarios de la farmacia alcanzado";
			codigo = -3;
		}
		
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		return msj;
	}

	// Alta de usuario farmacia que realiza el administador de DUSA
	public MensajeError altaUsuarioFarmaciaPorDUSA(String usuario, String clave, String nombre, String email, String telefono, int farmacia){
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		
		// Obtengo la instancia del manejador de usuarios
		ManejadorFarmacia mFarmacia = ManejadorFarmacia.getInstance();
		Farmacia f = mFarmacia.find(farmacia);
		
		// Chequeo que no este en el limite de usuarios para la farmacia
		if (f.limiteUsuarios()){
			
			// Creo el usuario a partir de los datos
			UsuarioFarmacia nuevoUsuario = new UsuarioFarmacia(usuario, clave, nombre, email, telefono);
			
			// Obtengo la instancia del manejador y busco el rol correspondiente segun el nombre
			ManejadorRol mRol = ManejadorRol.getInstance();
			Rol rolUsuario = mRol.find(ConstantesDominio.ID_ROL_USUARIO_FARMACIA);
			
			if (rolUsuario != null){
							
				// Creo la lista de roles con el rol correspondiente
				List<Rol> roles = new ArrayList<Rol>();
				roles.add(rolUsuario);
				nuevoUsuario.setRoles(roles);
				nuevoUsuario.setFarmacia(f);
						
				try{
					ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
					mUsuario.add(nuevoUsuario);
				} catch (Exception ex){
					retorno = "Error al insertar el usuario";
					codigo = -1;
				}
			} else{
				retorno = "Rol no encontrado";
				codigo = -2;
			}

		} else {
			retorno = "Limite de usuarios de la farmacia alcanzado";
			codigo = -3;
		}
		
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		return msj;
	}

	
	public String inicioSesion(String usr, String password) {
		ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();		
			
		Usuario u;
		String loginExitoso = "";
		try{
			if(usr == null || password == null || usr.isEmpty() || password.isEmpty()){
				throw new Exception("Parametros ivalidos");
			}			
			u = mUsuario.find(usr);
			if (u == null){
				throw new Exception("No existe el usuario");
			}			
			if(password.equals(u.getClave())){
				// password correcto				
				if (! haySesionIniciada(u)) { 
					List<Rol> roles = u.getRoles();
					List<String> rolesToString = new ArrayList<String>();						
					for (int i = 0; i < roles.size(); i++) {  
					      rolesToString.add(roles.get(i).getIdRol());   						        
					    }		
					
					if(rolesToString.contains("ADMINDUSA")){
						u.setLogueado('S');
						//TODO
						loginExitoso = u.getNombre();
					}
					else{ 
						Farmacia f;
						if (rolesToString.contains(ConstantesDominio.ID_ROL_ADMIN_FARMACIA) || rolesToString.contains(ConstantesDominio.ID_ROL_USUARIO_FARMACIA)){
							f = ((UsuarioFarmacia)u).getFarmacia();
						}						
						else{ // prog defensiva						
							throw new Exception("Inconsistencia en roles");
						}							
						if (f != null && f.getHabilitado() == 'S'){
							u.setLogueado('S');
							//TODO
							loginExitoso = u.getNombre();
						}
						else{
							throw new Exception("Farmacia no habilitada");
						}
					}										
				}
				else{
					// ya estas logueado ! que hacemos ?
				}				
			}
			else{
				throw new Exception("Clave incorrecta.");
			}	
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		return loginExitoso;						
	}

	
	public void cerrarSesion(Usuario usr) throws Exception{
		usr.setLogueado('N'); 		
		// TODO  con usr y pass
	}
	
	
	public boolean haySesionIniciada(Usuario usr){
		return (usr.getLogueado() == 'S' );
	}
	
	public DataResultObtRepartos obtenerRepartosUsuario(String user){
		List<Integer> lista = new LinkedList<Integer>();
		DataResultObtRepartos result = new DataResultObtRepartos();
		ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
		UsuarioFarmacia u = (UsuarioFarmacia)mUsuario.find(user);
		lista = u.obtenerDataRepartos();
		result.setRepartos(lista);
		MensajeError msj = new MensajeError();
		msj.setCodigo(1);
		msj.setMensaje("ok");
		result.setMsj(msj);
		return result;
	}
	
	public DataResultObtFormPago obtenerFormasPagoUsuario(String user){
		DataResultObtFormPago result = new DataResultObtFormPago();
		List<String> lista = new LinkedList<String>();
		ManejadorUsuario mUsuario = ManejadorUsuario.getInstance();
		UsuarioFarmacia u = (UsuarioFarmacia)mUsuario.find(user);
		lista = u.obtenerDataFormasDePago();
		result.setFormasPago(lista);
		MensajeError msj = new MensajeError();
		msj.setCodigo(1);
		msj.setMensaje("ok");
		result.setMsj(msj);
		return result;
	}
	
	public static String toSHA1(String str) {
	    MessageDigest md = null;
	    byte[] convertme = str.getBytes(); 
	    try {
	        md = MessageDigest.getInstance("SHA-1");
	    }
	    catch(NoSuchAlgorithmException e) {
	        e.printStackTrace();
	    } 
	    return byteArrayToHexString(md.digest(convertme));	    
	}
	
	public static String byteArrayToHexString(byte[] b) {
		  String result = "";
		  for (int i=0; i < b.length; i++) {
		    result +=
		          Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
		  }
		  return result;
	}

	

}
