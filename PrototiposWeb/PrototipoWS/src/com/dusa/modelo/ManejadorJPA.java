package com.dusa.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class ManejadorJPA {

	private static EntityManagerFactory emf;

    
    public void contextInitialized() {
        emf = Persistence.createEntityManagerFactory("DUSAWeb");
    }

    public void contextDestroyed() {
        emf.close();
    }

    
    public EntityManager crearEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("El contexto no esta inicializado aún");
        }
        return emf.createEntityManager();
    }

}
