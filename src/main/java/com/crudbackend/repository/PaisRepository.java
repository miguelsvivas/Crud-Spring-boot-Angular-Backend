package com.crudbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudbackend.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long> {

}
