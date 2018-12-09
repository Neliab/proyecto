package com.avengers.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avengers.entidad.EFichaClinica;


@Repository("repositoriofichaclinica")
public interface RFichaClinica extends JpaRepository<EFichaClinica,Serializable> {
	public abstract EFichaClinica findByNumero(int numero );

}
