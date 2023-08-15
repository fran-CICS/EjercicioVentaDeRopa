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
        unaPrenda = new Prenda();
    }

    @Test
    void testPrecioPrendaNueva() {
        assertEquals(
                /* Deberia ser el precio de una prenda nueva */ BigDecimal.ZERO,
                unaPrenda.calcularPrecio()
        );
    }

    @Test
    void testPrecioPrendaEnPromo() {
        assertEquals(
                /* Deberia ser el precio de una prenda en promo */ BigDecimal.ZERO,
                unaPrenda.calcularPrecio()
        );
    }

    @Test
    void testPrecioPrendaEnLiqui() {
        assertEquals(
                /* Deberia ser el precio de una prenda en liquidacion */ BigDecimal.ZERO,
                unaPrenda.calcularPrecio()
        );
    }

}