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

import com.avengers.entidad.EPaciente;
import com.avengers.entidad.EPropietario;
import com.avengers.modelo.MPaciente;
import com.avengers.modelo.MPropietario;
import com.avengers.servicio.SPaciente;


@RestController 
@RequestMapping("/mpaciente")
public class CPaciente {
	@Autowired
	@Qualifier("serviciopaciente")
	private SPaciente servicio;
	
	@PutMapping("/insertar")
	public boolean insertarPaciente (@RequestBody @Valid EPaciente p) {
		return servicio.ingresarPaciente(p);
	}
	
	@GetMapping("/pacientes/{id}")
	public EPaciente mostrarPaci(@PathVariable("id") int id) {
		return servicio.mostrarP(id);
	}
	
	@GetMapping("/pacientes")
	public List<MPaciente> muestraTodos (){
		return servicio.listarPacientes();
	}
	@DeleteMapping("/eliminarpropietario/{rut})")
	public boolean eliminarPropi(@PathVariable("rut") int rut) {
	return servicio.borrarPaciente(rut);
	}
}
