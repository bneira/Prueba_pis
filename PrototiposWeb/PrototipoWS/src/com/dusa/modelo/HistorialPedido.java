package com.dusa.modelo;

import java.util.List;

public class HistorialPedido {
	
	
	private Farmacia farmacia;
	private List<Pedido> pedido;
	
	public Farmacia getFarmacia() {
		return farmacia;
	}
	public void setFarmacia(Farmacia farmacia) {
		this.farmacia = farmacia;
	}
	public List<Pedido> getPedido() {
		return pedido;
	}
	public void setPedido(List<Pedido> pedido) {
		this.pedido = pedido;
	}
	
	

}
