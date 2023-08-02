package com.veterinaria.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITA")
public class Cita {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	
	private int id;
	@Column(name = "paciente")
	private String paciente;
	@Column(name = "medico")
	private String medico;
	
	public Cita() {
		super();
	}

	public Cita(int id, String paciente, String medico) {
		super();
		this.id = id;
		this.paciente = paciente;
		this.medico = medico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	
	
	
}
