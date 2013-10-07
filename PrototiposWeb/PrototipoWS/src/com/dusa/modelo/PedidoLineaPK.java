package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class PedidoLineaPK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	
	@Column(name = "IDPEDIDO",nullable = false, updatable = false, insertable = false)
	private int idPedido;

	@Column(name = "NRO_ARTICULO",nullable = false, updatable = false, insertable = false)
	private int idProducto;
	
	@Column(name = "CONRECETA", nullable = false)
	private char conReceta;
	
	
	public int hashCode() {
        return (int) (idPedido + idProducto);
    }

    public boolean equals(Object obj) {
        if(obj == this) 
        	return true;
        else if(!(obj instanceof PedidoLineaPK)) 
        	return false;
		else
			return ((PedidoLineaPK) obj).idPedido == idPedido &&
			        ((PedidoLineaPK) obj).idProducto == idProducto &&
			        ((PedidoLineaPK) obj).conReceta == conReceta;
    }

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public char getConReceta() {
		return conReceta;
	}

	public void setConReceta(char conReceta) {
		this.conReceta = conReceta;
	}
	

}
