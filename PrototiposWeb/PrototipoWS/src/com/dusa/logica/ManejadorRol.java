package com.dusa.logica;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.dusa.modelo.ManejadorJPA;
import com.dusa.modelo.Rol;
import com.dusa.modelo.Usuario;

public class ManejadorRol {

    private static ManejadorRol instance = null;

	
	public static ManejadorRol getInstance(){
        if (instance==null)
               instance=new ManejadorRol();
        return instance;
	};
	
	
	public boolean add(Rol rol){
		boolean resultado = member(rol.getIdRol());
		if(!resultado){
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			EntityTransaction tx = entity.getTransaction();
			tx.begin();
			entity.persist(rol);
			tx.commit();
			resultado = true;
		}
		
		return resultado;		
	}
	
	
	public Rol find(String idRol){
		Rol resultado = null;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Rol encontre = entity.find(Rol.class, idRol);
		
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = encontre;			
		}
		
		return resultado;
		
	}
	
	public boolean member(String idRol)	{
		
		boolean resultado = false;
		
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager entity = manejador.crearEntityManager();
		
		Rol encontre = entity.find(Rol.class, idRol);
		if(encontre != null && encontre.getEliminado()=='N'){
			resultado = true;			
		}
		
		return resultado;		
	}
	
}
