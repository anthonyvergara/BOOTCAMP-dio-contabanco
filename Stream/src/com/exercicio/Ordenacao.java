package com.exercicio;

import java.util.List;

public class Ordenacao {
	
//	Desafio 1 - Mostre a lista na ordem numérica:
//	Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
	
	public List<Integer> ordenarNumeros(List<Integer> numeros){
		
		numeros.stream().sorted();
		
		return numeros;
	}
	
}
