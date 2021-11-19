package com.crudbackend.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.crudbackend.model.Pais;
import com.crudbackend.repository.PaisRepository;

@Service
public class PaisService {
	
	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
	
		return paisRepository.findAll();
	}


	public List<Pais> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	
}
