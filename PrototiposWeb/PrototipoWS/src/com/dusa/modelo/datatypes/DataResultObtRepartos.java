package com.dusa.modelo.datatypes;

import java.io.Serializable;
import java.util.List;

public class DataResultObtRepartos implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	private List<Integer> repartos;
	
	private MensajeError msj;

	public List<Integer> getRepartos() {
		return repartos;
	}

	public void setRepartos(List<Integer> repartos) {
		this.repartos = repartos;
	}

	public MensajeError getMsj() {
		return msj;
	}

	public void setMsj(MensajeError msj) {
		this.msj = msj;
	}
	
	

}
