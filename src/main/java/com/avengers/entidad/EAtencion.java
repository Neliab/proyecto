package com.avengers.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name="atencion")
@Entity(name="EAtencion")

public class EAtencion implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "atenumero")
	private int numero;
	
	@Column(name ="atefecha_consulta")
	private Date fecha_consulta;
	
	public EAtencion() {}

	public EAtencion(int numero, Date fecha_consulta) {
		this.numero = numero;
		this.fecha_consulta = fecha_consulta;
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
