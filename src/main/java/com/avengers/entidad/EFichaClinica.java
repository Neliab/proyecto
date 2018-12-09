package com.avengers.entidad;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="fichaClinica")
@Entity(name="EFichaClinica")

public class EFichaClinica implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "fichanumero")
	private int numero;

	@Column(name="descripcion")
	private String descripcion;
	
	
	
	public EFichaClinica() {}
	

	public EFichaClinica(int numero, String descripcion) {
		this.numero = numero;
		this.descripcion = descripcion;
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
