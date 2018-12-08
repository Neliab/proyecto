package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.agrupador.APaciente;
import com.avengers.entidad.EPaciente;
import com.avengers.entidad.EPropietario;
import com.avengers.modelo.MPaciente;
import com.avengers.modelo.MPropietario;
import com.avengers.repositorio.RPaciente;

@Service("serviciopaciente")
public class SPaciente {
	@Autowired
	@Qualifier("repositoriopaciente")
	private RPaciente repositoriopaciente ;
	@Autowired
	@Qualifier("agrupadorpaciente")
	private APaciente agrupador ;
	
	public boolean ingresarPaciente (EPaciente p) {
		try {
			repositoriopaciente.save(p);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	public boolean borrarPaciente (int i) {
		try {
			EPaciente aux= repositoriopaciente.findById(i);
			repositoriopaciente.delete(aux);;
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public EPaciente mostrarP(int id) {
		return repositoriopaciente.findById(id);
	}
	
	public List<MPaciente> listarPacientes(){
		List<EPaciente> aux=  repositoriopaciente.findAll();
		return agrupador.agruparListaPacientes(aux);
	}
	
}
