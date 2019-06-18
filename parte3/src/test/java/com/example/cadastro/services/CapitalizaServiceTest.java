package com.example.cadastro.services;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CapitalizaServiceTest {

    private CapitalizaService capitalizaService;

    @Before
    public void setup() {
        capitalizaService = new CapitalizaService();
    }

    @Test
    public void capitalizarStringSimples() {

        String resultado = capitalizaService.capitalizar("qualquer");

        assertEquals("Qualquer",resultado);
    }

    @Test
    public void capitalizarStringSimplesTudoMaiusculo() {

        String resultado = capitalizaService.capitalizar("QUALQUER");

        assertEquals("Qualquer",resultado);
    }

    @Test
    public void capitalizarStringComposta() {

        String resultado = capitalizaService.capitalizar("rick sanches");

        assertEquals("Rick Sanches",resultado);
    }


}