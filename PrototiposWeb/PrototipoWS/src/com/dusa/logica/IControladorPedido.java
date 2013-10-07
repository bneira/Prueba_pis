package com.dusa.logica;

import com.dusa.modelo.datatypes.DataResultConfirmPedido;
import com.dusa.modelo.datatypes.MensajeError;

public interface IControladorPedido {

	public MensajeError realizarNuevoPedido(String idUsuario);
	
	public MensajeError agregarProd(int prodId, int cant, char conReceta);
	
	public MensajeError eliminarProdPedido(int prodId, char conReceta);
	
	public MensajeError asignarReparto(int repartoId);
	
	public MensajeError asignarFormaDePago(String formaPagoId);
	
	public DataResultConfirmPedido confirmarPedido();
	

}
