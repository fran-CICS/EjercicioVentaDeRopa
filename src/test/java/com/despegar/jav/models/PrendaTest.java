package com.despegar.jav.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PrendaTest {

    private Prenda unaPrenda;

    @BeforeEach
    void setUp(){
        unaPrenda = new Prenda("Remera negra", new BigDecimal(2500), new Nueva());
    }

    @Test
    void testPrecioPrendaNueva() {
        assertEquals(
                new BigDecimal(2500),
                unaPrenda.calcularPrecio()
        );
    }

    @Test
    void testPrecioPrendaEnPromo() {
        unaPrenda.setEstadoPrenda(new Promocion(new BigDecimal(300)));
        assertEquals(
                new BigDecimal(2200),
                unaPrenda.calcularPrecio()
        );
    }

    @Test
    void testPrecioPrendaEnLiqui() {
        unaPrenda.setEstadoPrenda(new Liquidacion());
        assertEquals(
                new BigDecimal(1250),
                unaPrenda.calcularPrecio()
        );
    }

}