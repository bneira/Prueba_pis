package com.dusa.modelo;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Farmacia
 *
 */
@Entity
@Table(name="CLIENTES")
public class Farmacia implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Farmacia() {
		super();
	}
	
	@Id
	@Column(name = "NRO_CLIENTE", nullable = false)
	private int nroCliente;
	
	@Column(name = "DIRECCION", nullable = false)
	private String direccion;
	
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;
	
	@Column(name = "HABILITADO", nullable = false)
	private char habilitado;
	
	@Column(name = "RUC", nullable = false)
	private String rut;
	
	@Column(name = "EMAIL", nullable = false)
	private String mail;
	
	@Column(name = "COD_VENCI", nullable = false)
	private int cod_venci;
	
	@Column(name = "VENCI_CTADO", nullable = false)
	private int venci_ctado;
	
	@Column(name = "CANTIDAD_WEB", nullable = false)
	private int cantWeb;
	
	@OneToMany (fetch = FetchType.EAGER)
	@JoinColumn(name="NRO_CLIENTE", referencedColumnName="NRO_CLIENTE")
	private List<Reparto> repartos;

	public List<Reparto> getRepartos() {
		return repartos;
	}
	public void setRepartos(List<Reparto> repartos) {
		this.repartos = repartos;
	}
	// **** GETTERS Y SETTERS ****
	public int getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(int nroCliente) {
		this.nroCliente = nroCliente;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getCod_venci() {
		return cod_venci;
	}
	public void setCod_venci(int cod_venci) {
		this.cod_venci = cod_venci;
	}
	public int getVenci_ctado() {
		return venci_ctado;
	}
	public void setVenci_cdo(int venci_cdo) {
		this.venci_ctado = venci_cdo;
	}
	public int getCantWeb() {
		return cantWeb;
	}
	public void setCantWeb(int cantWeb) {
		this.cantWeb = cantWeb;
	}	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public char getHabilitado() {
		return habilitado;
	}
	public void setHabilitado(char habilitado) {
		this.habilitado = habilitado;
	}
	public void setVenci_ctado(int venci_ctado) {
		this.venci_ctado = venci_ctado;
	}
	// **** OTROS METODOS ****	
	public boolean existeAdmin(){
		// NO SE QUE HACE Y SI ES NECESARIA
		return false;
	}
	
	public boolean limiteUsuarios(){
		// DE DONDE OBTENGO LOS USUARIOS?? (MANEJADOR)
		return true;
	}
	
	public Reparto obtenerReparto(int repartoId){
		
		Reparto reparto = null;
		
		for ( Reparto rep : repartos)
		{
			if (rep.getIdReparto() == repartoId) {
				reparto = rep;
			}
		}
		
		
		return reparto;
	}
	
	public FormaDePago obtenerFormaDePago(String formaPagoId){
		
		FormaDePago f = null;
		ManejadorJPA manejador = new ManejadorJPA();
		manejador.contextInitialized();
		EntityManager em = manejador.crearEntityManager();
		
		f = em.find(FormaDePago.class,formaPagoId);
		//buscar la forma de pago segun el id en la tabla
		return f;
		
	}
	
	public List<String> obtenerFormasDePago(){
		List<String> lista = new LinkedList<String>();
		
		lista.add(ConstantesDominio.FORMA_DE_PAGO_CONTADO);
		
		if (this.cod_venci != 0) {
			lista.add(ConstantesDominio.FORMA_DE_PAGO_CREDITO);
		}
		
		if (this.venci_ctado != 0) {
			lista.add(ConstantesDominio.FORMA_DE_PAGO_ESPECIAL);
		}
		
		//ver las condiciones y agregarlas
		return lista;
	}
	
	public List<Integer> obtenerDataRepartos(){
		List<Integer> lista = new LinkedList<Integer>();
		
		for ( Reparto rep : repartos)
		{
			lista.add(rep.getIdReparto());
		}
		
		//ver las condiciones y agregarlas
		return lista;
	}
	
   
}
