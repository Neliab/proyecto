package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.avengers.entidad.EAtencion;
import com.avengers.modelo.MAtencion;


@Component("agrupadoratenciones")
public class AAtencion {
	public List<MAtencion> agruparListaAtenciones (List<EAtencion> at){
		List<MAtencion> mat = new ArrayList <MAtencion>();
			for (EAtencion a : at) {
				mat.add(new MAtencion(a));
			}
			return mat;
	}
	
	public MAtencion agrupaFichas (EAtencion at) {
		return new MAtencion (at);
	}
}
