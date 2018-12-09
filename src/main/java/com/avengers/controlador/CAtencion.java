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

import com.avengers.entidad.EAtencion;
import com.avengers.modelo.MAtencion;
import com.avengers.servicio.SAtencion;


@RestController 
@RequestMapping("/matencion")
public class CAtencion {
	@Autowired
	@Qualifier("servicioatencion")
	private SAtencion servicio;
	
	@PutMapping("/insertar")
	public boolean insertarAtencion (@RequestBody @Valid EAtencion a) {
		return servicio.ingresarAtencion(a);
	}
	
	@GetMapping("/atenciones/{numero}")
	public EAtencion mostrarAtenciones(@PathVariable("numero") int nro) {
		return servicio.mostrarA(nro);
	}
	
	@GetMapping("/atenciones")
	public List<MAtencion> muestraTodos (){
		return servicio.listarAtencion();
	}
	
	@DeleteMapping("/eliminaratencion/{numero})")
	public boolean eliminarAtencion(@PathVariable("numero") int nro) {
	return servicio.borrarAtencion(nro);
	}
}
