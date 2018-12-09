package com.avengers.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table (name="paciente")
@Entity
public class EPaciente implements Serializable{
	@GeneratedValue
	@Id
	@Column(name="pacid")
	private int pacid;
	@ManyToOne
	@JoinColumn(name="proprut")
	private EPropietario proprut;
	@Column(name="alergias")
	private String alergias;
	@Column(name="especie")
	private String especie;
	@Column(name="esterilizado")
	private String esterilizado;
	@Column(name="fecha_nacimiento")
	private Date fecha_nacimiento;
	@Column(name="microchip")
	private String microchip;
	@Column(name="pacnombre")
	private String pacnombre;		
	@Column(name="pelaje")
	private String pelaje;		
	@Column(name="raza")
	private String raza;		
	@Column(name="sexo")
	private String sexo;
	
	/*Constructores*/
	public EPaciente() {
	}

	public EPaciente(int pacid, EPropietario propietarioR, String alergias, String especie, String esterilizado,
			Date fecha_nacimiento, String microchip, String pacnombre, String pelaje, String raza, String sexo) {
		this.pacid = pacid;
		this.proprut = propietarioR;
		this.alergias = alergias;
		this.especie = especie;
		this.esterilizado = esterilizado;
		this.fecha_nacimiento = fecha_nacimiento;
		this.microchip = microchip;
		this.pacnombre = pacnombre;
		this.pelaje = pelaje;
		this.raza = raza;
		this.sexo = sexo;
	}

	public int getPacid() {
		return pacid;
	}

	public void setPacid(int pacid) {
		this.pacid = pacid;
	}

	public EPropietario getproprut() {
		return proprut;
	}

	public void setproprut(EPropietario propietarioR) {
		this.proprut = propietarioR;
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

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getMicrochip() {
		return microchip;
	}

	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}

	public String getPacnombre() {
		return pacnombre;
	}

	public void setPacnombre(String pacnombre) {
		this.pacnombre = pacnombre;
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


}
