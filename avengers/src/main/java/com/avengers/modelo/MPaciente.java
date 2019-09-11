package com.avengers.modelo;

import java.util.Date;

import com.avengers.entidad.EPaciente;
import com.avengers.entidad.EPropietario;

public class MPaciente {
	private int pacid;
	private int proprut;
	private String alergias;
	private String especie;
	private String esterilizado;
	private Date fecha_nacimiento;
	private String microchip;
	private String pacnombre;		
	private String pelaje;		
	private String raza;		
	private String sexo;

	
	/*Constructores*/
	public MPaciente() {
	}
	public MPaciente(int pacid, EPropietario propietarioR, String alergias, String especie, String esterilizado,
			Date fecha_nacimiento, String microchip, String pacnombre, String pelaje, String raza, String sexo) {
		this.pacid = pacid;
		this.proprut =propietarioR.getRut();
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
	public MPaciente(EPaciente paciente) {
		this.pacid = paciente.getPacid();
		this.proprut =paciente.getproprut().getRut();
		this.alergias = paciente.getAlergias();
		this.especie = paciente.getEspecie();
		this.esterilizado = paciente.getEsterilizado();
		this.fecha_nacimiento = paciente.getFecha_nacimiento();
		this.microchip = paciente.getMicrochip();
		this.pacnombre = paciente.getPacnombre();
		this.pelaje = paciente.getPelaje();
		this.raza = paciente.getRaza();
		this.sexo = paciente.getSexo();
	}
	public int getPacid() {
		return pacid;
	}
	public void setPacid(int pacid) {
		this.pacid = pacid;
	}
	public int getproprut() {
		return proprut;
	}
	public void setPropietarioR(int propietarioR) {
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
	
	/*Getter y setter*/
	
	
	
}
