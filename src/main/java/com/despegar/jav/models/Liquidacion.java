package com.despegar.jav.models;

import java.math.BigDecimal;

public class Liquidacion implements EstadoPrenda{
    private BigDecimal porcentajeDescuento = new BigDecimal(2);
    public BigDecimal calcularPrecio(Prenda prenda){
        return prenda.getPrecioBase().divide(porcentajeDescuento);
    }
}