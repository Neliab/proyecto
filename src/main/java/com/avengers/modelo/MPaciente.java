package com.avengers.modelo;

import java.util.Date;
import java.util.List;

import com.avengers.entidad.EFichaClinica;
import com.avengers.entidad.EPaciente;
import com.avengers.entidad.EPropietario;

public class MPaciente {
	private int id;
	private String alergias;
	private String especie;
	private String esterilizado;
	private Date fechaNac;
	private String nombre;
	private String pelaje;
	private String raza;
	private String sexo;
	private EPropietario propietario;
	
	public MPaciente() {}

	public MPaciente(int id, String alergias, String especie, String esterilizado, Date fechaNac, String nombre,
			String pelaje, String raza, String sexo, EPropietario propietario) {
		this.id = id;
		this.alergias = alergias;
		this.especie = especie;
		this.esterilizado = esterilizado;
		this.fechaNac = fechaNac;
		this.nombre = nombre;
		this.pelaje = pelaje;
		this.raza = raza;
		this.sexo = sexo;
		this.propietario = propietario;
		
	}
	/*--------------*/
	public MPaciente(EPaciente p) {
		this.id = p.getId();
		this.alergias = p.getAlergias();
		this.especie = p.getEspecie();
		this.esterilizado = p.getEsterilizado();
		this.fechaNac = p.getFechaNac();
		this.nombre = p.getNombre();
		this.pelaje = p.getPelaje();
		this.raza = p.getRaza();
		this.sexo = p.getSexo();
		this.propietario = p.getPropietario();
	}
/*------------*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEsterilizado() {
		return esterilizado;
	}

	public void setEsterilizado(String esterilizado) {
		this.esterilizado = esterilizado;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public EPropietario getPropietario() {
		return propietario;
	}

	public void setPropietario(EPropietario propietario) {
		this.propietario = propietario;
	}
	
	
	
}
