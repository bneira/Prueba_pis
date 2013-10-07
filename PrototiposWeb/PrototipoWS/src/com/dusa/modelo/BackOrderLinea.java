package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BackOrderLinea
 *
 */
@Entity
@Table(name="WEBBACKORDERLINEA")
public class BackOrderLinea implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public BackOrderLinea() {
		super();
	}
	
	@EmbeddedId
    private BackOrderLineaPK backOrderLineaPK;

	@PrimaryKeyJoinColumn(name="IDPEDIDO",referencedColumnName = "IDPEDIDO")
	private Pedido pedido;
	
	@JoinColumn(name="NRO_ARTICULO",referencedColumnName = "NRO_ARTICULO")
	private Producto producto;	
	
	@Column(name = "CANTIDAD", nullable = false)
	private int cantidad;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;

	public BackOrderLineaPK getBackOrderLineaPK() {
		return backOrderLineaPK;
	}
	public void setBackOrderLineaPK(BackOrderLineaPK backOrderLineaPK) {
		this.backOrderLineaPK = backOrderLineaPK;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
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
	
	
   
}
