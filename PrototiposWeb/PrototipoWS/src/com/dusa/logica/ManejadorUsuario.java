package com.dusa.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.dusa.modelo.ManejadorJPA;
import com.dusa.modelo.Usuario;

public class ManejadorUsuario {
	
	private static ManejadorUsuario instance = null;
	
	public static ManejadorUsuario getInstance(){
		if(instance == null)
			instance = new ManejadorUsuario();
		return instance;
	}
	
	public boolean add(Usuario user){
		boolean resultado = member(user.getUsuario());
		if(!resultado){
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			user.setEliminado('N');//ojo lo tendria que hacer el contructor
			entity.persist(user);
			tx.commit();
			resultado = true;
		}
		
		return resultado;		
	}
	
	public Usuario find(String user){
		Usuario resultado = null;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Usuario encontre = entity.find(Usuario.class, user);
		
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = encontre;			
		}
		
		return resultado;		
	}
	
	public boolean member(String user)	{
		
		boolean resultado = false;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Usuario encontre = entity.find(Usuario.class, user);
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = true;			
		}
		
		return resultado;		
	}
	
	public boolean delete (String user){
		
		boolean resultado = false;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
			
		Usuario aBorrar = entity.find(Usuario.class, user);
		if(aBorrar != null ){
			aBorrar.setEliminado('S');
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			entity.merge(aBorrar);
			tx.commit();
			resultado = true;
		}
		
		return resultado;
		
	}
	
}
	

