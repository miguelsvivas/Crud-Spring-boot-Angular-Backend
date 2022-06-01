package com.crudbackend.service;

import com.crudbackend.model.Persona;
import com.crudbackend.repository.PersonaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

class PersonaServiceTest {

    @Mock
    private PersonaRepository personaRepository;

    @InjectMocks
    private PersonaService personaService;

    private Persona persona;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

        persona = new Persona();

        persona.setId(1L);
        persona.setNombre("miguel");
    }

    @Test
    void save() {
        when(personaRepository.save(any(Persona.class))).thenReturn(persona);
        assertNotNull(personaService.save(new Persona()));

    }
}