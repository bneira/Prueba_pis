package com.dusa.modelo.datatypes;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DataResultConfirmPedido implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double monto;
	
	private List<DataBackOrder> bk;
	
	private MensajeError msj;

	
	public MensajeError getMsj() {
		return msj;
	}

	public void setMsj(MensajeError msj) {
		this.msj = msj;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public List<DataBackOrder> getBk() {
		return bk;
	}

	public void setBk(List<DataBackOrder> bk) {
		this.bk = bk;
	}
	
	

}
