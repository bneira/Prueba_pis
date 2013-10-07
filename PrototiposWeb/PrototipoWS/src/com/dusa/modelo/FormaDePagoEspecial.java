package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FormaDePagoEspecial
 *
 */
@Entity
@Table(name="WEBFORMASDEPAGO")
public class FormaDePagoEspecial extends FormaDePago implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public FormaDePagoEspecial() {
		super();
	}
   
}
