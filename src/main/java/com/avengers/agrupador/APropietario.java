package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.avengers.modelo.MPropietario;
import com.avengers.entidad.EPropietario;

@Component("agrupadorpropietarios")
public class APropietario {
	public List<MPropietario> agruparListaPropietarios (List<EPropietario> prop){
		List<MPropietario> mprop = new ArrayList <MPropietario>();
			for (EPropietario e : prop) {
				mprop.add(new MPropietario(e));
			}
			return mprop;
	}
	
	public MPropietario agrupaPropietario (EPropietario prop) {
		return new MPropietario (prop);
	}
}
