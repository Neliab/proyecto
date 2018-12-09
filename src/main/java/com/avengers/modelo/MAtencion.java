package com.avengers.modelo;

import java.util.Date;

import com.avengers.entidad.EAtencion;

public class MAtencion {
	private int numero;
	private Date fecha_consulta;
	
	public MAtencion() {}
	
	public MAtencion(int numero, Date fecha_consulta) {
		this.numero = numero;
		this.fecha_consulta = fecha_consulta;
	}
	
	public MAtencion(EAtencion a) {
		this.numero=a.getNumero();
		this.fecha_consulta=a.getFecha_consulta();
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Date getFecha_consulta() {
		return fecha_consulta;
	}
	public void setFecha_consulta(Date fecha_consulta) {
		this.fecha_consulta = fecha_consulta;
	}
	
	
}
