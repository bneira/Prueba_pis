package com.dusa.logica;



import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.dusa.modelo.ConstantesDominio;
import com.dusa.modelo.Farmacia;
import com.dusa.modelo.ManejadorJPA;


public class ManejadorFarmacia {

    private static ManejadorFarmacia instance = null;

    //private List<Farmacia> farmacias;
	
	public static ManejadorFarmacia getInstance(){
        if (instance==null)
               instance=new ManejadorFarmacia();
        return instance;
	};
	
	public Farmacia find(int nroCli){
		
		Farmacia resultado = null;
		
		try{
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			
			Farmacia encontre = entity.find(Farmacia.class, nroCli);
			
			if(encontre != null && encontre.getHabilitado() == ConstantesDominio.FARMACIA_HABILITADA){
				resultado = encontre;			
			}
		}catch(Exception e){
			System.out.println("Error: Falló el find a farmacias");
		}
		
		return resultado;		
	}
	
	public boolean member(int nroCli)	{
		
		boolean resultado = false;
		try{
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			
			Farmacia encontre = entity.find(Farmacia.class, nroCli);
			if(encontre != null && encontre.getHabilitado()== ConstantesDominio.FARMACIA_HABILITADA){
				resultado = true;			
			}
		}catch(Exception e){
			System.out.println("Error: Falló el member a farmacias");
		}
		
		return resultado;		
	}
	
	// Retorna todas las farmacias habilitadas
	public List<Farmacia> values(){
		List<Farmacia> res = new LinkedList<Farmacia>();
		try{
			ManejadorJPA manejador = new ManejadorJPA();
			manejador.contextInitialized();
			EntityManager entity = manejador.crearEntityManager();
			
			String consultaString = "SELECT f FROM Farmacia f WHERE f.habilitado = 'S'";
		        
	        // Creacion de la consulta y ejecucion de la consulta
	        Query consulta = entity.createQuery(consultaString);     
			res = consulta.getResultList();
	       
		}catch (Exception e){
			System.out.println("Error: Falló obtención de farmacias");
			System.out.print(e.getMessage());
		}
		 return res;
	}
	
	
}
