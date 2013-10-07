package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FormaDePagoCredito
 *
 */
@Entity
@Table(name="WEBFORMASDEPAGO")
public class FormaDePagoCredito extends FormaDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FormaDePagoCredito() {
		super();
	}
   
}
