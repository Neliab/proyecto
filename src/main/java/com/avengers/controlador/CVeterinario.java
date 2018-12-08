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

import com.avengers.entidad.EVeterinario;
import com.avengers.modelo.MVeterinario;
import com.avengers.servicio.SVeterinario;


@RestController 
@RequestMapping("/mveterinario")
public class CVeterinario {
	@Autowired
	@Qualifier("servicioveterinario")
	private SVeterinario servicio;
	
	@PutMapping("/insertar")
	public boolean insertarVterinario (@RequestBody @Valid EVeterinario v) {
		return servicio.ingresarVeterinario(v);
	}
	
	@GetMapping("/veterinarios/{rut}")
	public EVeterinario mostrarVet(@PathVariable("rut") int rut) {
		return servicio.mostrarV(rut);
	}
	@GetMapping("/veterinarios")
	public List<MVeterinario> muestraTodos (){
		return servicio.listarVeterinarios();
	}
	@DeleteMapping("/eliminarveterinario/{rut})")
	public boolean eliminarVet(@PathVariable("rut") int rut) {
	return servicio.borrarVeterinario(rut);
}
}
