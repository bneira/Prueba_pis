package com.dusa.logica;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.dusa.modelo.datatypes.DataResultConfirmPedido;
import com.dusa.modelo.datatypes.MensajeError;
import com.dusa.modelo.BackOrderLinea;
import com.dusa.modelo.ConstantesDominio;
import com.dusa.modelo.EstadoPedido;
import com.dusa.modelo.ManejadorJPA;
import com.dusa.modelo.Pedido;
import com.dusa.modelo.UsuarioFarmacia;






import java.util.List;

public class ControladorPedidoProducto implements IControladorPedido{
	
	
	private Pedido pedidoMem;
	
	
	public Pedido getPedidoMem() {
		return pedidoMem;
	}

	public void setPedidoMem(Pedido pedidoMem) {
		this.pedidoMem = pedidoMem;
	}

	public MensajeError realizarNuevoPedido(String idUsuario)
	{
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		ManejadorUsuario manejadorUsu = ManejadorUsuario.getInstance();
		
		UsuarioFarmacia usuarioLocal = (UsuarioFarmacia) manejadorUsu.find(idUsuario);
		boolean tienePed = usuarioLocal.tienePedidoPendiente();
		if (tienePed) {
			retorno = "El usuario tiene un Pedido pendiente o en curso";
			codigo = -1;
		}
		else
		{
			//********************* SACAR ESTO DE PERSISTENCIA
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager em = manejador.crearEntityManager();
			
			//******************************** 
			
			EstadoPedido estadoPedConf = em.find(EstadoPedido.class,ConstantesDominio.ID_ESTADO_PEDIDO_EN_CURSO);
			Pedido pedido = new Pedido();
			

			pedido.setEstado(estadoPedConf);
			pedido.setEliminado('N');
			Date day = new Date();			
			pedido.setFecha(day);
			pedido.setUsuario(usuarioLocal);
			ManejadorPedido manejPed = ManejadorPedido.getInstance();
			boolean ok = manejPed.add(pedido);
			if (!ok) {
				retorno = "No se pudo agregar el pedido";
				codigo = -1;
			}
			else {
				pedidoMem = pedido;
			}
				
			
		}
		msj.setCodigo(codigo);
		msj.setMensaje(retorno);
		return msj;
	
	
	}
	
	public MensajeError agregarProd(int prodId, int cant, char conReceta) {
		
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		this.pedidoMem.agregarProducto(prodId, cant, conReceta);
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();	
		
		tx.begin();
	    
	    try { 
	        em.merge(this.pedidoMem);
			tx.commit();
		} catch(Exception e) {
			retorno = "No se pudo agregar el producto";
			codigo = -1;
			tx.rollback(); 
		} 
	    msj.setCodigo(codigo);
	    msj.setMensaje(retorno);
	    return msj;
	}
	
public MensajeError eliminarProdPedido(int prodId, char conReceta) {
		
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		this.pedidoMem.eliminarProducto(prodId, conReceta);
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();	
		
		tx.begin();
	    
	    try { 
	        em.merge(this.pedidoMem);
			tx.commit();
		} catch(Exception e) {
			retorno = "No se pudo eliminar el producto";
			codigo = -1;
			tx.rollback(); 
		} 
	    
	    msj.setCodigo(codigo);
	    msj.setMensaje(retorno);
	    return msj;
	}
	
	public MensajeError asignarReparto(int repartoId) {
		
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		this.pedidoMem.setRepartoUsuario(repartoId);
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();	
		
		tx.begin();
	    
	    try { 
	        em.merge(this.pedidoMem);
			tx.commit();
		} catch(Exception e) {
			tx.rollback(); 
			retorno = "No se pudo asignar el reparto";
			codigo = -1;
		} 
	    
	    msj.setCodigo(codigo);
	    msj.setMensaje(retorno);
	    return msj;
	}
	
	public MensajeError asignarFormaDePago(String formaPagoId) {
		
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		this.pedidoMem.setFormaPagoUsuario(formaPagoId);
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();	
		
		tx.begin();
	    
	    try { 
	        em.merge(this.pedidoMem);
			tx.commit();
		} catch(Exception e) {
			retorno = "No se pudo asignar el reparto";
			codigo = -1;
			tx.rollback(); 
		} 
		
	    msj.setCodigo(codigo);
	    msj.setMensaje(retorno);
	    return msj;
	}
	
	public DataResultConfirmPedido confirmarPedido() {
		String retorno = "ok";
		int codigo = 1;
		MensajeError msj = new MensajeError();
		
		if (this.pedidoMem.existeLineaProd()) {
			
			DataResultConfirmPedido data = this.pedidoMem.confirmarPedido();
			
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager em = manejador.crearEntityManager();
			EntityTransaction tx = em.getTransaction();	
			
			tx.begin();
		    
		    try { 
		        em.merge(this.pedidoMem);
				tx.commit();
			} catch(Exception e) {
				tx.rollback(); 
				retorno = "No se pudo confirmar el pedido";
				
			} 
		    msj.setMensaje(retorno);
		    if (retorno.compareTo("ok") == 0)
		    	msj.setCodigo(codigo);
		    else
		    	msj.setCodigo(-1);
		    data.setMsj(msj);

			return data;
		}
		else {
			DataResultConfirmPedido data = new DataResultConfirmPedido();
			codigo = -1;
			retorno = "No existe ningun producto asociado al pedido";
			msj.setCodigo(codigo);
			msj.setMensaje(retorno);
			data.setMsj(msj);

			return data;
		}
	    
	}

}
