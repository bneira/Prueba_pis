package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RepartoPK implements Serializable{	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
			
	@Column(name = "REPARTO", nullable = false)
	private int idReparto;

	@Column(name = "NRO_CLIENTE", nullable = false, insertable = false, updatable = false)
	private int nroCliente;
	
	
	public RepartoPK(int idFarmacia, int idReparto) {
		this.idReparto = idReparto;
		this.nroCliente = idFarmacia;
	}


	public int hashCode() {
        return (int) (idReparto + nroCliente);
    }
	public RepartoPK() {
	
	
	}
   
	public int getIdReparto() {
		return idReparto;
	}



	public void setIdReparto(int idReparto) {
		this.idReparto = idReparto;
	}



	public int getNroCliente() {
		return nroCliente;
	}



	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}



	public boolean equals(Object obj) {
        if(obj == this) 
        	return true;
        else if(!(obj instanceof RepartoPK)) 
        	return false;
		else
			return ((RepartoPK) obj).idReparto == idReparto &&
			        ((RepartoPK) obj).nroCliente == nroCliente;
    } 
	
	
}
