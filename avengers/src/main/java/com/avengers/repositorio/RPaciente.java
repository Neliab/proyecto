package com.avengers.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.entidad.EPaciente;


@Repository("repositoriopaciente")
 public interface RPaciente extends JpaRepository<EPaciente,Serializable>{
	public abstract EPaciente findByPacid(int pacid);
}
