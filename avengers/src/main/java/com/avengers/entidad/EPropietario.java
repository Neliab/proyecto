package com.avengers.entidad;
import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="propietario")
@Entity
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
	

	
	public EPropietario() {
	}
	
	
	
	public EPropietario(int rut, String nombre, String telefono, String email, String direccion) {
		this.rut = rut;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.direccion = direccion;
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
	
	//private static final long serialVersionUID = 1L;
}
