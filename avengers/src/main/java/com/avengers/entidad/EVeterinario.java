package com.avengers.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="veterinario")
@Entity
public class EVeterinario implements Serializable {
	@Id
	@Column(name = "veterut")
	private int rut;
	@Column(name = "vetedireccion")
	private String direccion;
	@Column(name = "veteespecialidad")
	private String especialidad;
	@Column(name = "vetenombre")
	private String nombre;
	@Column(name = "vetetelefono")
	private String telefono;
	
	public EVeterinario() {
		
	}
	
	public EVeterinario(int rut, String direccion, String especialidad, String nombre, String telefono) {
		this.rut = rut;
		this.direccion = direccion;
		this.especialidad = especialidad;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
