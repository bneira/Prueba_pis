package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FormaDePago
 *
 */
@Entity
@Table(name="WEBFORMASDEPAGO")
public abstract class  FormaDePago implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public FormaDePago() {
		super();
	}
	
	@Id
	@Column(name = "IDFORMADEPAGO", nullable = false)
	private String idFormaDePago;
	
	@Column(name = "ELIMINADO", nullable = false)
	private char eliminado;

	public String getIdFormaDePago() {
		return idFormaDePago;
	}
	public void setIdFormaDePago(String idFormaDePago) {
		this.idFormaDePago = idFormaDePago;
	}
	public char getEliminado() {
		return eliminado;
	}
	public void setEliminado(char eliminado) {
		this.eliminado = eliminado;
	}
	
	
   
}
