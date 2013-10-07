package com.dusa.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.dusa.modelo.BackOrderLinea;
import com.dusa.modelo.ManejadorJPA;
import com.dusa.modelo.Pedido;
import com.dusa.modelo.PedidoLinea;


public class ManejadorPedido {
	
	private static ManejadorPedido instance = null;
	
	public static ManejadorPedido getInstance(){
		if(instance == null)
			instance = new ManejadorPedido();
		return instance;
	}
	
	public boolean add(Pedido pedido){
		boolean resultado = member(pedido);
		if(!resultado){
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			pedido.setEliminado('N');
			entity.persist(pedido);
			
			//guardo las lineas
			/*for(PedidoLinea linea : pedido.getLineas()){
				linea.setEliminado('N');
				entity.persist(linea);
			}
			
			//guardo las backOrderLineas
				for(BackOrderLinea linea : pedido.getLineasBackOrder() ){
					linea.setEliminado('N');
					entity.persist(linea);
				}*/
			tx.commit();
			resultado = true;
		}
		
		return resultado;		
	}
	
	public Pedido find(Pedido pedido){
		Pedido resultado = null;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Pedido encontre = entity.find(Pedido.class, pedido);
		
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = encontre;			
		}
		
		return resultado;		
	}
	
	public boolean member(Pedido pedido)	{
		
		boolean resultado = false;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Pedido encontre = entity.find(Pedido.class, pedido.getIdPedido());
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = true;			
		}
		
		return resultado;		
	}
	
	public boolean delete (Pedido pedido){
		
		boolean resultado = false;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
			
		Pedido aBorrar = entity.find(Pedido.class, pedido.getUsuario());
		if(aBorrar != null ){
			aBorrar.setEliminado('S');
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			entity.merge(aBorrar);
			
			//borro las lineas
			for(PedidoLinea linea : pedido.getLineas()){
				linea.setEliminado('S');
				entity.merge(linea);				
			}
			
			//borro la backOrdersLineas
			for(BackOrderLinea lineaBack : pedido.getLineasBackOrder()){
					lineaBack.setEliminado('S');
			     	entity.merge(lineaBack);				
			}
			
			tx.commit();
			resultado = true;
		}
		
		return resultado;
		
	}
}
