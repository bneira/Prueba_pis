package com.dusa.modelo;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Laboratorio
 *
 */
@Entity
@Table(name="LABORATORIOS")
public class Laboratorio implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Laboratorio() {
		super();
	}
	
	@Id
	@Column(name = "LAB", nullable = false)
	private String idLaboratorio;
	
	@Column(name = "NOMLAB", nullable = true)
	private String nombre;

	public String getIdLaboratorio() {
		return idLaboratorio;
	}
	public void setIdLaboratorio(String idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
   
}
