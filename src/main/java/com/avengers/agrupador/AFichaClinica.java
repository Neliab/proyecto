package com.avengers.agrupador;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.avengers.entidad.EFichaClinica;
import com.avengers.modelo.MFichaClinica;


@Component("agrupadorfichas")
public class AFichaClinica {
	public List<MFichaClinica> agruparListaFichas (List<EFichaClinica> ficha){
		List<MFichaClinica> mficha = new ArrayList <MFichaClinica>();
			for (EFichaClinica f : ficha) {
				mficha.add(new MFichaClinica(f));
			}
			return mficha;
	}
	
	public MFichaClinica agrupaFichas (EFichaClinica ficha) {
		return new MFichaClinica (ficha);
	}
}
