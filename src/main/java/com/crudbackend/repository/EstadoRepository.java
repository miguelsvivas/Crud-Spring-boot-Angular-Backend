package com.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudbackend.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
}
