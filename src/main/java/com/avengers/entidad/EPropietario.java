package com.avengers.entidad;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="propietario")
@Entity(name ="EPropietario")
public class EPropietario implements Serializable{
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "proprut")
	private int rut;
	@Column(name = "propdireccion")
	private String direccion;
	@Column(name = "propemail")
	private String email;
	@Column(name = "propnombre")
	private String nombre;
	@Column(name = "proptelefono")
	private String telefono;
	
	@OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "EPaciente")
	private List<EPaciente> paciente;
	
	
	public EPropietario() {
	}

	public EPropietario(int rut, String direccion, String email, String nombre, String telefono,
			List<EPaciente> paciente) {
		this.rut = rut;
		this.direccion = direccion;
		this.email = email;
		this.nombre = nombre;
		this.telefono = telefono;
		this.paciente = paciente;
	}



	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		this.rut = rut;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<EPaciente> getPaciente() {
		return paciente;
	}

	public void setPaciente(List<EPaciente> paciente) {
		this.paciente = paciente;
	}
	
	//private static final long serialVersionUID = 1L;
}
