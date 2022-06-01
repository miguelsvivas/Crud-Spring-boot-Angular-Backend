package com.crudbackend.service;

import com.crudbackend.model.Estado;
import com.crudbackend.model.Pais;
import com.crudbackend.repository.EstadoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class EstadoServiceTest {

    @Mock
    private EstadoRepository estadoRepository;

    @InjectMocks
    private EstadoService estadoService;

    private Estado estado;


    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

        estado = new Estado();

        estado.setPais(new Pais());

        estado.setNombre("miguel");

        estado.setId(new Long(1L));



    }

    @Test
    void findAll() {

        when(estadoRepository.findAll()).thenReturn(Arrays.asList(estado));

        assertNotNull(estadoService.findAll());
    }

    @Test
    void findAllSort() {

        when(estadoRepository.findAll(any(Sort.class))).thenReturn(Arrays.asList(estado));

        assertNotNull(estadoService.findAll(Sort.by(Sort.Direction.ASC,"ID")));
    }



}