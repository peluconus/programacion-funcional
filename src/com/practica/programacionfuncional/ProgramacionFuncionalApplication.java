package com.practica.programacionfuncional;

import java.util.*;
import java.util.stream.Collectors;

import com.practica.programacionfuncional.builders.EjemploBuilder;
import com.practica.programacionfuncional.model.Ejemplo;

public class ProgramacionFuncionalApplication {

	public static void main(String[] args) {

		List<String> colores = Arrays.asList("rojo", "amarillo", "azul", "verde");

		// String[] colores = new String[] {"rojo", "amarillo", "azul", "verde"};

		System.out.println(buscaColor(colores, "rojo"));
		System.out.println(buscaColor(colores, "rosa"));
		System.out.println(buscaColorFuncional(colores, "azul"));
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> numeros2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		System.out.println(numeros.stream()
				.mapToInt(x -> x)
				.sum());
		
		System.out.println(numeros2.stream()
				.map(x -> x.toString())
				.collect(Collectors.toList()));
		
		//Creamos los dos ejemplos que vamos a utilizar y los añadimos a una lista
		
		Ejemplo ej1 = new Ejemplo("ejemplo uno", 4);
		Ejemplo ej2 = new EjemploBuilder().build(3);
		
		List<Ejemplo> ejemplos = Arrays.asList(ej1, ej2);
		
		//Esta función devuelve el objeto transformado a String usando la función toString()
		//de la clase Ejemplo
		System.out.println(ejemplos.stream()
				.map(Ejemplo::toString)
				.collect(Collectors.toList()));
		
		//Esta función devuelve los objetos que no han sido creados mediante el builder,
		//es decir, los que no tienen el valor1 por defecto, e imprime sólo su valor1
		System.out.println(ejemplos.stream()
				.filter(x -> !x.getValor1().equals("Por defecto"))
				.map(Ejemplo::getValor1)
				.collect(Collectors.toList()));
		
		
		//Esta función devuelve la suma de los valores valor2 de cada Ejemplo que haya en
		//la lista de ejemplos
		System.out.println(ejemplos.stream()
				.mapToInt(x -> x.getValor2())
				.sum());
		
	}

	public static boolean buscaColor(List<String> colores, String color) {
		boolean res = false;
		for (String c : colores) {
			if (c.equals(color)) {
				res = true;
				break;
			}
		}
		return res;
	}

	public static boolean buscaColorFuncional(List<String> colores, String color) {
		return colores.contains(color);
	}
	
	public static Integer suma(Integer a, Integer b) {
		return a+b;
	}
}
