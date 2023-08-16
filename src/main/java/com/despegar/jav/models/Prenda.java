package com.despegar.jav.models;

import java.math.BigDecimal;

public class Prenda {
	private String nombre;

	private BigDecimal precioBase;
	private EstadoPrenda estadoPrenda;

	public Prenda(String nombre, BigDecimal precioBase, EstadoPrenda estadoPrenda) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.estadoPrenda = estadoPrenda;
	}

	public BigDecimal getPrecioBase() {
		return precioBase;
	}

	public BigDecimal calcularPrecio() {
		return estadoPrenda.calcularPrecio(this);
	}

	public void setEstadoPrenda(EstadoPrenda estadoPrenda) {
		this.estadoPrenda = estadoPrenda;
	}
}
