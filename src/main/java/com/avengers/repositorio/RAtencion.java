package com.avengers.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.entidad.EAtencion;

@Repository("repositorioatencion")
public interface RAtencion extends JpaRepository<EAtencion,Serializable>{
	public abstract EAtencion findByNumero(int numero );

}
