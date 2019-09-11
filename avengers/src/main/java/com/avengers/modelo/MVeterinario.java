package com.avengers.modelo;

import com.avengers.entidad.EPropietario;
import com.avengers.entidad.EVeterinario;

public class MVeterinario {
		private int rut;
		private String nombre;
		private String telefono;
		private String especialidad;
		private String direccion;
		
		
		public MVeterinario() {
			
		}			
		
		public MVeterinario(int rut, String nombre, String telefono, String especialidad, String direccion) {
			this.rut = rut;
			this.nombre = nombre;
			this.telefono = telefono;
			this.especialidad = especialidad;
			this.direccion = direccion;
		}
		
		public  MVeterinario(EVeterinario v) {
			this.rut = v.getRut();
			this.direccion = v.getDireccion();
			this.nombre = v.getNombre();
			this.telefono = v.getTelefono();
			this.especialidad = v.getEspecialidad();
		}
		
		public int getRut() {
			return rut;
		}
		public void setRut(int rut) {
			this.rut = rut;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEspecialidad() {
			return especialidad;
		}
		public void setEspecialidad(String especialidad) {
			this.especialidad = especialidad;
		}
		public String getDireccion() {
			return direccion;
		}
		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}
		
		
		
}
