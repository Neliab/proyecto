package com.avengers.modelo;

import com.avengers.entidad.EFichaClinica;
import com.avengers.entidad.EPaciente;

public class MFichaClinica {
	private int numero;
	private String descripcion;
	
	private MFichaClinica() {}

	
	public MFichaClinica(int numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
	}


	public MFichaClinica(EFichaClinica f) {
		this.numero=f.getNumero();
		this.descripcion=f.getDescripcion();
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


	
	
}
