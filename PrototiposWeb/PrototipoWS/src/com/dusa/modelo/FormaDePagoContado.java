package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FormaDePagoContado
 *
 */
@Entity
@Table(name="WEBFORMASDEPAGO")
public class FormaDePagoContado extends FormaDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FormaDePagoContado() {
		super();
	}
   
}
