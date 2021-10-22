package com.practica.programacionfuncional.model;

import java.util.List;

public class Ejemplo {

	private String valor1;
	private Integer valor2;

	public Ejemplo(String valor1, Integer valor2) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}

	public String toString() {
		return "Ejemplo [valor1=" + valor1 + ", valor2=" + valor2 + "]";
	}

	public Integer suma(List<Ejemplo> ejemplos) {
		return ejemplos.stream()
				.mapToInt(x -> x.getValor2())
				.sum();
	}
}
