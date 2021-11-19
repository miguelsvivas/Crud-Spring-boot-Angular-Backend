package com.crudbackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.crudbackend.model.Persona;
import com.crudbackend.repository.PersonaRepository;

@Service
public class PersonaService{
	
	@Autowired
	private PersonaRepository personaRepository;


	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	public List<Persona> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Persona> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}


	public <S extends Persona> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}




	public Persona getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


	public <S extends Persona> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}


	public <S extends Persona> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	public <S extends Persona> S save(S entity) {
		
		return personaRepository.save(entity);
	}


	public Optional<Persona> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}




	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}


	public void deleteById(Long id) {
		personaRepository.deleteById(id);
		
	}


	public void delete(Persona entity) {
		personaRepository.delete(entity);
		
	}




}
