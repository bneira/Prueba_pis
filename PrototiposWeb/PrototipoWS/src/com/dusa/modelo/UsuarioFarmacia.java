package com.dusa.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UsuarioFarmacia
 *
 */
@Entity
@Table(name="WEBUSUARIOS")
public class UsuarioFarmacia extends Usuario implements Serializable {

	
	private static final long serialVersionUID = 1L;	


	// **** CONSTRUCTORES ****
	public UsuarioFarmacia() {
		super();
	}
	
	public UsuarioFarmacia(String usuario, String clave, String nombre, String email, String telefono){
		setUsuario(usuario);
		setClave(clave);
		setNombre(nombre);
		setEmail(email);
		setTelefono(telefono);
		setEliminado(ConstantesDominio.NO_ELIMINADO);
		setHabilitado(ConstantesDominio.USUARIO_HABILITADO);
		setLogueado(ConstantesDominio.USUARIO_NO_LOGUEADO);
		
	}
	
	@JoinColumn(name="NRO_CLIENTE",referencedColumnName = "NRO_CLIENTE",nullable = true)
	private Farmacia farmacia;
	
	@Column(name = "TELEFONO", nullable = true)
	protected String telefono;
		
	@OneToMany()
	@JoinColumn(name="USUARIO")
	private List<Pedido> listaPedido;
	
	
	public List<Pedido> getListaPedido() {
		return listaPedido;
	}

	public void setListaPedido(List<Pedido> listaPedido) {
		this.listaPedido = listaPedido;
	}

	public Farmacia getFarmacia() {
		return farmacia;
	}

	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public boolean tienePedidoPendiente(){
		
		//retorna si tiene algun pedido pendiente
		
		boolean retorno = false;
		
		for ( Pedido ped : listaPedido)
		{
			
			//*********SACAR ESTO DE PERSISTENCIA //*******************
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager em = manejador.crearEntityManager();
			
			//***********************************************************
			
			EstadoPedido estadoPedConf = em.find(EstadoPedido.class,ConstantesDominio.ID_ESTADO_PEDIDO_EN_CURSO);
			EstadoPedido estadoPedGuar = em.find(EstadoPedido.class,ConstantesDominio.ID_ESTADO_PEDIDO_GUARDADO);
			
			//Chequea no este guardado ni encurso el pedido
			if (ped.getEstado().getIdEstadoPedido() == estadoPedConf.getIdEstadoPedido()
				|| ped.getEstado().getIdEstadoPedido() == estadoPedGuar.getIdEstadoPedido()) {
				
			
				return true;
			}		
			
		}
		
		return retorno;
		
		
	}	
	
	public Reparto obtenerReparto(int repartoId) {

		return this.farmacia.obtenerReparto(repartoId);
	}
	
	public FormaDePago obtenerFormaDePago(String formaPagoId) {
		return this.farmacia.obtenerFormaDePago(formaPagoId) ;
	}
	
	public List<Integer> obtenerDataRepartos() {
		return this.farmacia.obtenerDataRepartos();
	}
	
	public List<String> obtenerDataFormasDePago() {
		return this.farmacia.obtenerFormasDePago();
	}

   
}
