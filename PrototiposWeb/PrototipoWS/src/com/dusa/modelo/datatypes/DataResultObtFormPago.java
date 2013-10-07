package com.dusa.modelo.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataResultObtFormPago implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<String> formasPago;
	
	private MensajeError msj;

	public List<String> getFormasPago() {
		return formasPago;
	}

	public void setFormasPago(List<String> formasPago) {
		this.formasPago = formasPago;
	}

	public MensajeError getMsj() {
		return msj;
	}

	public void setMsj(MensajeError msj) {
		this.msj = msj;
	}
	
	
}
