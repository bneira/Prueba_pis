package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.PrimaryKeyJoinColumn;

@Embeddable
public class BackOrderLineaPK implements Serializable{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;	
		
		@PrimaryKeyJoinColumn(name = "IDPEDIDO")
		private int idPedido;

		@Column(name = "NRO_ARTICULO",insertable = false ,updatable = false)
		private int idProducto;
		
		public int hashCode() {
	        return (int) (idPedido + idProducto);
	    }

	    public boolean equals(Object obj) {
	        if(obj == this) 
	        	return true;
	        else if(!(obj instanceof BackOrderLineaPK)) 
	        	return false;
			else
				return ((BackOrderLineaPK) obj).idPedido == idPedido &&
				        ((BackOrderLineaPK) obj).idProducto == idProducto;
	    }

}
