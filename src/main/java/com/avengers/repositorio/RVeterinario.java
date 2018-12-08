package com.avengers.repositorio;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.avengers.entidad.EVeterinario;

@Repository("repositorioveterinario")
public interface RVeterinario extends JpaRepository<EVeterinario,Serializable> {
	public abstract EVeterinario findByRut(int rut);
}
