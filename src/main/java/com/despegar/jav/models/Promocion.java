package com.despegar.jav.models;

import java.math.BigDecimal;

public class Promocion implements EstadoPrenda{
    private BigDecimal valorFijo;

    public Promocion(BigDecimal valorFijo) {
        this.valorFijo = valorFijo;
    }
    public BigDecimal calcularPrecio(Prenda prenda){
        return prenda.getPrecioBase().subtract(valorFijo);
    }
}
