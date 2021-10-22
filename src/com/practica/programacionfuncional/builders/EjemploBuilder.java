package com.practica.programacionfuncional.builders;

import com.practica.programacionfuncional.model.Ejemplo;

public class EjemploBuilder {
	
	public Ejemplo build(Integer valor2) {
		String valor1 = "Por defecto";
		return new Ejemplo(valor1, valor2);
	}

}
