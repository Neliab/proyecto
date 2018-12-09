package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.agrupador.AAtencion;
import com.avengers.entidad.EAtencion;
import com.avengers.modelo.MAtencion;
import com.avengers.repositorio.RAtencion;


@Service("servicioatencion")
public class SAtencion {
	@Autowired
	@Qualifier("repositorioatencion")
	private RAtencion repositorioatencion ;
	@Autowired
	@Qualifier("agrupadoratencion")
	private AAtencion agrupador ;
	
	public boolean ingresarAtencion (EAtencion a) {
		try {
			repositorioatencion.save(a);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	public boolean borrarAtencion (int n) {
		try {
			EAtencion aux= repositorioatencion.findByNumero(n);
			repositorioatencion.delete(aux);;
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public EAtencion mostrarA(int nro) {
		return repositorioatencion.findByNumero(nro);
	}
	
	public List<MAtencion> listarAtencion(){
		List<EAtencion> aux=  repositorioatencion.findAll();
		return agrupador.agruparListaAtenciones(aux);
	}
}
