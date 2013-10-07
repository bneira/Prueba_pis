package com.dusa.modelo;

import com.dusa.logica.Fabrica;
import com.dusa.logica.IControladorUsuario;


public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("### COMIENZO DEL MAIN ###");
		
/*		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized(null);
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();			
		
		// Creo estado de prueba
		EstadoPedido estado = new EstadoPedido();
		estado.setDescripcion("Pendiente");
		estado.setIdEstadoPedido("estado de prueba");
		
		// Fecha
		Date fecha = new Date(2013,9,25);

		// Creo forma de pago de prueba
		FormaDePagoContado fpc = new FormaDePagoContado();
		fpc.setIdFormaDePago("Contado");
		fpc.setEliminado('N');
		
		// Creo una farmacia
		Farmacia nuevaFarm = new Farmacia();
		nuevaFarm.setCantWeb(5);
		nuevaFarm.setCod_venci(0);
		nuevaFarm.setDireccion("Avenida siempre libre 666");
		nuevaFarm.setMail("lafarmacia@JPAdelOrto");
		nuevaFarm.setNroCliente(9059);
		nuevaFarm.setVenci_cdo(0);
		nuevaFarm.setNombre("F1");
		nuevaFarm.setRut(5);
		
		Reparto rep = new Reparto();
		rep.setFarmacia(nuevaFarm);
		rep.setIdReparto(12345);
		
		tx.begin();
			    
		    try { 
		        em.persist(nuevaFarm);
				em.persist(rep); 
				tx.commit();
			} catch(Exception e) {
				tx.rollback(); 
			} 
		
		
		// Traigo un cliente
		Farmacia farmacia = em.find(Farmacia.class,9059);
		
		
		
		// Me traigo el reparto de prueba
		RepartoPK rpk = new RepartoPK();
		rpk.setIdReparto(12345);
		rpk.setNroCliente(9059);
		Reparto reparto = em.find(Reparto.class, rpk);
		
		
		// Roles
		Rol rol = new Rol();
		rol.setDescripcion("rol de prueba");
		rol.setEliminado('N');
		rol.setIdRol("id rol");
		List<Rol> roles = new  LinkedList<Rol>();
		roles.add(rol);
		
		// Creo usuario de prueba
		UsuarioFarmacia u = new UsuarioFarmacia();
		u.setClave("usuario de prueba");
		u.setEliminado('N');
		u.setLogueado('N');
		u.setRoles(roles);
		u.setUsuario("usuario de prueba");
		
		
		// Pedido a insertar
		Pedido wp = new Pedido();
        wp.setEliminado('N');
        wp.setEstado(estado);
        wp.setFecha(fecha);
        wp.setFormaDePago(fpc);
        wp.setReparto(reparto);
        wp.setUsuario(u);
        
        
        tx.begin();
        
        try { 
            em.persist(estado);
            em.persist(fpc); 
            em.persist(reparto);
            em.persist(rol);
            em.persist(u);
            em.persist(wp);
            tx.commit();
        } catch(Exception e) {
            tx.rollback(); 
        } */
     
		
		IControladorUsuario cu = new Fabrica().getInstance().getIUsuario();
	
		/*
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized(null);
		
		EntityManager em = manejador.crearEntityManager();
		EntityTransaction tx = em.getTransaction();		
		
		
		UsuarioAdminFarmacia uaf1 = new UsuarioAdminFarmacia("FERNANDO", "7c4a8d09ca3762af61e59520943dc26494f8941b","usr_af1","usr_af1@gmail.com", "99999999");
		
		Rol rol = new Rol();
		rol.setDescripcion("rol de prueba");
		rol.setEliminado('N');
		rol.setIdRol("id rol");
		List<Rol> roles = new  LinkedList<Rol>();
		roles.add(rol);
		
		uaf1.setRoles(roles);
		tx.begin();
		try { 
			em.persist(uaf1);            
            tx.commit();
        } catch(Exception e) {
            tx.rollback(); 
        } 
		
	*/
		System.out.println("### XXXXXXXXXXXXXXXXXXXXX ###");
		System.out.println(cu.inicioSesion("FERNANDO","7c4a8d09ca3762af61e59520943dc26494f8941b"));
		System.out.println("### XXXXXXXXXXXXXXXXXXXXX ###");

        System.out.println("### FIN DEL MAIN ###");

	}

}
