package com.avengers.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Table(name="paciente")
@Entity(name="EPaciente")
public class EPaciente implements Serializable {
	/**
	 * 
	 */
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "pacid")
	private int id;
	@Column(name = "alergias")
	private String alergias;
	@Column (name="especie")
	private String especie;
	@Column (name="esterilizado")
	private String esterilizado;
	@Column (name="fecha_nacimiento")
	private Date fechaNac;
	@Column (name="pacnombre")
	private String nombre;
	@Column (name="pelaje")
	private String pelaje;
	@Column (name="raza")
	private String raza;
	@Column (name="sexo")
	private String sexo;
	
	@ManyToOne
	@JoinColumn(name = "proprut", nullable = false)
	private EPropietario propietario;

	public EPaciente() {
		
	}
	
	public EPaciente(int id, String alergias, String especie, String esterilizado, Date fechaNac, String nombre,
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

/*	public void setPropietario(EPropietario propietario) {
		this.propietario = propietario;
	}*/
	
	private static final long serialVersionUID = 1L;
	
}

