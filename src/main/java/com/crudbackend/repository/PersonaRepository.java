package com.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudbackend.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long >{
	
	
}
