package com.dusa.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.dusa.modelo.ConstantesDominio;
import com.dusa.modelo.Farmacia;
import com.dusa.modelo.ManejadorJPA;
import com.dusa.modelo.Producto;

public class ManejadorProducto {
//singleton
	
	private static ManejadorProducto instance = null;
		
	public static ManejadorProducto getInstance(){
		if(instance == null)
			instance = new ManejadorProducto();
		return instance;
	}
	
	public Producto find(int prodId){
		Producto resultado = null;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		resultado = entity.find(Producto.class, prodId);
		
		
		return resultado;		
	}
	
	public boolean member(int prodId){
		boolean resultado = false;
		try{
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			
			Producto encontre = entity.find(Producto.class, prodId);
			if(encontre != null){
				resultado = true;			
			}
		}catch(Exception e){
			System.out.println("Error: Falló el member a productos");
		}
		
		return resultado;		
	}
}

