package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Service;

import com.avengers.agrupador.APropietario;

import com.avengers.entidad.EPropietario;
import com.avengers.repositorio.RPropietario;

import com.avengers.modelo.MPropietario;

@Service("serviciopropietario")
public class SPropietario {
	@Autowired
	@Qualifier("repositoriopropietario")
	private RPropietario repositoriopropietario ;
	@Autowired
	@Qualifier("agrupadorpropietarios")
	private APropietario agrupador ;
	
	
	public boolean ingresarPropietario (EPropietario p) {
		try {
			repositoriopropietario.save(p);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	
	public boolean borrarPropietario (int r) {
		try {
			EPropietario aux= repositoriopropietario.findByRut(r);
			repositoriopropietario.delete(aux);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public EPropietario mostrarP(int rut) {
		return repositoriopropietario.findByRut(rut);
	}
	
	public List<MPropietario> listarPropietarios(){
		List<EPropietario> aux=  repositoriopropietario.findAll();
		return agrupador.agruparListaPropietarios(aux);
	}
}
