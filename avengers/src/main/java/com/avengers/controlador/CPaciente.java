package com.avengers.controlador;

import java.util.Date;
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
import com.avengers.servicio.SPaciente;
import com.avengers.servicio.SPropietario;

@RestController
@RequestMapping("/mpaciente")
public class CPaciente {
	
	@Autowired
	@Qualifier("serviciopaciente")
	private SPaciente servicio;
	@Autowired
	@Qualifier("serviciopropietario")
	private SPropietario serviciop;
	
	@PutMapping("/insertar")
	public boolean insertarPaciente (@RequestBody @Valid MPaciente p) {
		EPropietario x = serviciop.mostrarP(p.getproprut()) ;
		EPaciente h= new EPaciente();
		h.setPacid(p.getPacid());
		h.setproprut(x);
		h.setAlergias(p.getAlergias());
		h.setEspecie(p.getEspecie());
		h.setEsterilizado(p.getEsterilizado());
		h.setFecha_nacimiento(p.getFecha_nacimiento());
		h.setMicrochip(p.getMicrochip());
		h.setPacnombre(p.getPacnombre());
		h.setPelaje(p.getPelaje());
		h.setRaza(p.getRaza());
		h.setSexo(p.getSexo());
		return servicio.ingresarPaciente(h);
	}
	
	@GetMapping("/paciente/{pacid}")
	public EPaciente mostrarpaci(@PathVariable("pacid") int pacid) {
		return servicio.mostrarPaciente(pacid);
	}
	
	@GetMapping("/pacientes")
	public List<MPaciente> muestraTodosPaci(){
		return servicio.listarPacientes();
	}
	
	@DeleteMapping("/eliminarpaciente/{pacid}")
	public boolean eliminarPaciente(@PathVariable("pacid") int pacid) {
		return servicio.borrarPaciente(pacid);
	}
}