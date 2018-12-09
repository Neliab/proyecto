package com.avengers.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.avengers.agrupador.AFichaClinica;
import com.avengers.entidad.EFichaClinica;
import com.avengers.modelo.MFichaClinica;
import com.avengers.repositorio.RFichaClinica;



@Service("serviciofichaclinica")
public class SFichaClinica {
	@Autowired
	@Qualifier("repositoriopaciente")
	private RFichaClinica repositorioficha ;
	@Autowired
	@Qualifier("agrupadorpaciente")
	private AFichaClinica agrupador ;
	
	public boolean ingresarFichaClinica (EFichaClinica f) {
		try {
			repositorioficha.save(f);
			return true;
		}catch (Exception e){
			return false;
		}
		
	}
	public boolean borrarFichaClinica (int n) {
		try {
			EFichaClinica aux= repositorioficha.findByNumero(n);
			repositorioficha.delete(aux);;
			return true;
		}catch (Exception e) {
			return false;
		}
	}
	
	public EFichaClinica mostrarF(int nro) {
		return repositorioficha.findByNumero(nro);
	}
	
	public List<MFichaClinica> listarFicha(){
		List<EFichaClinica> aux=  repositorioficha.findAll();
		return agrupador.agruparListaFichas(aux);
	}
}
