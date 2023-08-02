package com.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VETERINARIO")
public class Veterinario {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "cedula")
	private String cedula;
	
	
	
	public Veterinario() {
		super();
	}
	
	
	public Veterinario(int id, String nombre, String cedula) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cedula = cedula;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	
	
}
