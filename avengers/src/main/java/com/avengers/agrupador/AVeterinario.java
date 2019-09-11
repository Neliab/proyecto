package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.avengers.entidad.EVeterinario;
import com.avengers.modelo.MVeterinario;

@Component("agrupadorveterinarios")
public class AVeterinario {
	public List<MVeterinario> agruparListaVeterinarios (List<EVeterinario> vet){
		List<MVeterinario> mvet = new ArrayList <MVeterinario>();
			for (EVeterinario e : vet) {
				mvet.add(new MVeterinario(e));
			}
			return mvet;
	}
	
	public MVeterinario agrupaVeterinario (EVeterinario vet) {
		return new MVeterinario (vet);
	}
}

	