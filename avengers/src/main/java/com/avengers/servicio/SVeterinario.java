package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.agrupador.AVeterinario;
import com.avengers.entidad.EVeterinario;
import com.avengers.modelo.MVeterinario;
import com.avengers.repositorio.RVeterinario;

@Service("servicioveterinario")
public class SVeterinario {
	@Autowired
	@Qualifier("repositorioveterinario")
	private RVeterinario repositorioveterinario ;
	@Autowired
	@Qualifier("agrupadorveterinarios")
	private AVeterinario agrupador ;
	
	
	public boolean ingresarVeterinario (EVeterinario v) {
		try {
			repositorioveterinario.save(v);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	
	public boolean borrarVeterinario (int r) {
		try {
			EVeterinario aux= repositorioveterinario.findByRut(r);
			repositorioveterinario.delete(aux);
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public EVeterinario mostrarV(int rut) {
		return repositorioveterinario.findByRut(rut);
	}
	
	public List<MVeterinario> listarVeterinarios(){
		List<EVeterinario> aux=  repositorioveterinario.findAll();
		return agrupador.agruparListaVeterinarios(aux);
	}
}
