package com.avengers.controlador;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avengers.entidad.EFichaClinica;
import com.avengers.modelo.MFichaClinica;
import com.avengers.servicio.SFichaClinica;

@RestController 
@RequestMapping("/mfichaclinica")
public class CFichaClinica {
	@Autowired
	@Qualifier("serviciofichaclinica")
	private SFichaClinica servicio;
	
	@PutMapping("/insertar")
	public boolean insertarPaciente (@RequestBody @Valid EFichaClinica f) {
		return servicio.ingresarFichaClinica(f);
	}
	
	@GetMapping("/fichasclinicas/{numero}")
	public EFichaClinica mostrarFichas(@PathVariable("numero") int nro) {
		return servicio.mostrarF(nro);
	}
	
	@GetMapping("/fichasclinicas")
	public List<MFichaClinica> muestraTodos (){
		return servicio.listarFicha();
	}
	
	@DeleteMapping("/eliminarficha/{numero})")
	public boolean eliminarPropi(@PathVariable("numero") int nro) {
	return servicio.borrarFichaClinica(nro);
	}
}
