package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.avengers.entidad.EPaciente;
import com.avengers.modelo.MPaciente;

@Component("agrupadorpacientes")
public class APaciente {
	
	public List<MPaciente> agruparListaPacientes (List<EPaciente> paci){
		List<MPaciente> mpaci = new ArrayList<MPaciente>();
			for (EPaciente e : paci) {
				mpaci.add(new MPaciente(e));
			}
		return mpaci;
	}

	public MPaciente agrupaPaicente (EPaciente paci) {
		return new MPaciente (paci);
	}
}
