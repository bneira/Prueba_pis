package com.dusa.logica;

public class Fabrica {

	private static Fabrica instance = null;
	
	private IControladorUsuario iusuario;
	private IControladorPedido ipedido;
	
	
	public Fabrica(){
		this.ipedido = null;
		this.iusuario = null;
	}
	
	public static Fabrica getInstance(){
		if (instance == null){
			instance = new Fabrica();
		}
		return instance;
	}
	
	public IControladorUsuario getIUsuario(){
		if (this.iusuario == null){
			this.iusuario = new ControladorUsuario();
		}
		return this.iusuario;
	}
	
	public IControladorPedido getIPedido(){
		if (this.ipedido == null){
			this.ipedido = new ControladorPedidoProducto();
		}
		return this.ipedido;
	}
}
