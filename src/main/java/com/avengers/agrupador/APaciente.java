package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.avengers.entidad.EPaciente;
import com.avengers.modelo.MPaciente;


@Component("agrupadorpacientes")
public class APaciente {
	public List<MPaciente> agruparListaPacientes (List<EPaciente> pac){
		List<MPaciente> mpac = new ArrayList <MPaciente>();
			for (EPaciente e : pac) {
				mpac.add(new MPaciente(e));
			}
			return mpac;
	}
	
	public MPaciente agrupaPaciente (EPaciente pac) {
		return new MPaciente (pac);
	}
}
