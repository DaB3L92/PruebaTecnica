package com.veterinaria.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PACIENTE")
public class Paciente {
	
	@Id
	@Column(name = "id")
	@GeneratedValue
	private int id;
	@Column(name = "nombre_paciente")
	private String nombre_paciente;
	@Column(name = "tipo")
	private String tipo;
	@Column(name = "fecha_nacim")
	private String fecha_nacim;
	@Column(name = "nombre_propietario")
	private String nombre_propietario;
	@Column(name = "fecha_cita")
	private Date fecha_cita;
	private List<Cita> citas;
	
	
	
	public Paciente() {
		super();
	}
	
	
	public Paciente(int id, String nombre_paciente, String tipo, String fecha_nacim, String nombre_propietario,
			Date fecha_cita) {
		super();
		this.id = id;
		this.nombre_paciente = nombre_paciente;
		this.tipo = tipo;
		this.fecha_nacim = fecha_nacim;
		this.nombre_propietario = nombre_propietario;
		this.fecha_cita = fecha_cita;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre_paciente() {
		return nombre_paciente;
	}
	public void setNombre_paciente(String nombre_paciente) {
		this.nombre_paciente = nombre_paciente;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFecha_nacim() {
		return fecha_nacim;
	}
	public void setFecha_nacim(String fecha_nacim) {
		this.fecha_nacim = fecha_nacim;
	}
	public String getNombre_propietario() {
		return nombre_propietario;
	}
	public void setNombre_propietario(String nombre_propietario) {
		this.nombre_propietario = nombre_propietario;
	}
	public Date getFecha_cita() {
		return fecha_cita;
	}
	public void setFecha_cita(Date fecha_cita) {
		this.fecha_cita = fecha_cita;
	}
	
	@OneToMany(mappedBy = "id_cita_fk", targetEntity = Cita.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	public List<Cita> getHabitantes() {
		return citas;
	}
	public void setHabitantes(List<Cita> citas) {
		this.citas = citas;
	}
	
}
