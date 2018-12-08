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
import com.avengers.entidad.EPropietario;
import com.avengers.servicio.SPropietario;
import com.avengers.modelo.MPropietario;

@RestController 
@RequestMapping("/mpropietario")
public class CPropietario {
	@Autowired
	@Qualifier("serviciopropietario")
	private SPropietario servicio;
	
	@PutMapping("/insertar")
	public boolean insertarPropietario (@RequestBody @Valid EPropietario p) {
		return servicio.ingresarPropietario(p);
	}
	
	@GetMapping("/propietarios/{rut}")
	public EPropietario mostrarPropi(@PathVariable("rut") int rut) {
		return servicio.mostrarP(rut);
	}
	@GetMapping("/propietarios")
	public List<MPropietario> muestraTodos (){
		return servicio.listarPropietarios();
	}
	@DeleteMapping("/eliminarpropietario/{rut}")
			public boolean eliminarPropietario(@PathVariable("rut") int rut) {
		return servicio.borrarPropietario(rut);
	}
}
