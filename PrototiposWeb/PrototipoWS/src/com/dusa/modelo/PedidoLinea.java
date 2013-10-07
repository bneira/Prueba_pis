package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PedidoLinea
 *
 */
@Entity
@Table(name="WEBPEDIDOLINEAS")
public class PedidoLinea implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public PedidoLinea() {
		super();
		setPedidoLineaPK(new PedidoLineaPK());
		setEliminado('N');
	}	
	
	@EmbeddedId
    private PedidoLineaPK pedidoLineaPK;
	
	public PedidoLineaPK getPedidoLineaPK() {
		return pedidoLineaPK;
	}
	public void setPedidoLineaPK(PedidoLineaPK pedidoLineaPK) {
		this.pedidoLineaPK = pedidoLineaPK;
	}

	
	@ManyToOne () 
	@JoinColumn(name="IDPEDIDO", referencedColumnName = "IDPEDIDO")
	private Pedido pedido;
	
	@JoinColumn(name="NRO_ARTICULO",referencedColumnName = "NRO_ARTICULO")
	private Producto producto;	
	
	//@Column(name = "CONRECETA", nullable = false)
	//private char conReceta;	

	@Column(name = "CANTIDAD", nullable = false)
	private int cantidad;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;

	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
		this.getPedidoLineaPK().setIdProducto(producto.getNroArticulo());
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public char getEliminado() {
		return eliminado;
	}
	public void setEliminado(char eliminado) {
		this.eliminado = eliminado;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
		this.getPedidoLineaPK().setIdPedido(pedido.getIdPedido());
	}
   
}
