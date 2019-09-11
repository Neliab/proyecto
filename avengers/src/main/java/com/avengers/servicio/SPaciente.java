package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.agrupador.APaciente;
import com.avengers.entidad.EPaciente;
import com.avengers.modelo.MPaciente;
import com.avengers.repositorio.RPaciente;

@Service("serviciopaciente")
public class SPaciente {
	@Autowired
	@Qualifier("repositoriopaciente")
	private RPaciente repositoriopaciente;
	@Autowired
	@Qualifier("agrupadorpacientes")
	private APaciente agrupadorpac ;
	
	public boolean ingresarPaciente (EPaciente p) {
		try {
			if (p.getproprut().equals(null)) {
				return false;
			}
			repositoriopaciente.save(p);
			return true;
		}catch (Exception e){
			return false;
		}
	}
	
	public EPaciente mostrarPaciente(int pacid) {
		return repositoriopaciente.findByPacid(pacid);
	}
	
	public List<MPaciente> listarPacientes(){
		List<EPaciente> aux = repositoriopaciente.findAll() ;
		return agrupadorpac.agruparListaPacientes(aux);
	}
	public boolean borrarPaciente (int p) {
		try {
			EPaciente aux= repositoriopaciente.findByPacid(p);
			
			repositoriopaciente.delete(aux);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
}
