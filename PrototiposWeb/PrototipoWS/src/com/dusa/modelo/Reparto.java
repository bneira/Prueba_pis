package com.dusa.modelo;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;


/**
 * Entity implementation class for Entity: Reparto
 *
 */
@Entity
@Table(name="REPARTOS")
public class Reparto implements Serializable {

	
	private static final long serialVersionUID = 1L;


	
	@EmbeddedId
    private RepartoPK repartoPK;
	
	// GG
	//@Column(name = "REPARTO", nullable = false)
	//private int idReparto;
	
	@JoinColumn(name="NRO_CLIENTE",referencedColumnName = "NRO_CLIENTE")
	private Farmacia farmacia;

	
	public Reparto() {
		super();
		repartoPK = new RepartoPK();
	}
	
	public int getIdReparto() {
		return repartoPK.getIdReparto();
	}
	public void setIdReparto(int idReparto) {
		repartoPK.setIdReparto(idReparto);
	}
	public Farmacia getFarmacia() {
		return farmacia;
	}
	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}

	
	
	
	
   
}
