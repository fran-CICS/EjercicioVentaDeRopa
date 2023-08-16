package com.despegar.jav.models;

import java.math.BigDecimal;

public class Nueva implements EstadoPrenda{
    public BigDecimal calcularPrecio(Prenda prenda){
        return prenda.getPrecioBase();
    }
}
