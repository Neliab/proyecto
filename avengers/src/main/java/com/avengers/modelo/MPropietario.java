package com.avengers.modelo;

import com.avengers.entidad.EPropietario;

public class MPropietario {
	private int rut;
	private String nombre;
	private String telefono;
	private String email;
	private String direccion;
	
	
	
	
	// constructores
	public MPropietario() {
		
	}
	
	public MPropietario(int rut, String nombre, String telefono, String email, String direccion) {
		
		this.rut = rut;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	
	public MPropietario(EPropietario p) {
		this.rut = p.getRut();
		this.direccion = p.getDireccion();
		this.nombre = p.getNombre();
		this.telefono = p.getTelefono();
		this.email = p.getEmail();
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

	// Getter y setter
	
	

}
