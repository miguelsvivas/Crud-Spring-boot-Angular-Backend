package com.crudbackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.crudbackend.model.Estado;
import com.crudbackend.repository.EstadoRepository;

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository estadoRepository;

	
	public List<Estado> findAll() {
		
		return estadoRepository.findAll();
	}

	public List<Estado> findAll(Sort sort) {

		return estadoRepository.findAll(sort);
	}
	
	public List<Estado> findAllByCountry(Long id){
		List<Estado> estadosRespuesta = new ArrayList<>();
		List<Estado> estados = estadoRepository.findAll();
		for(int i=0; i<estados.size();i++) {
			if(estados.get(i).getPais().getId()== id) {
				estadosRespuesta.add(estados.get(i));
			}
		}
		
		return estadosRespuesta;
	}



	
	
}
