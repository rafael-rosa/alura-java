package br.com.empresa.banco;

import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
	public static void main(String[] args) {
		
		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<Integer>();
		long inicio = System.currentTimeMillis();
		
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		System.out.println("Tempo gasto for 1: " + tempo);
		inicio = System.currentTimeMillis();
		
		for (Integer i : teste) {
			teste.contains(i);
		}
				
		fim = System.currentTimeMillis();
		tempo = fim - inicio;
		System.out.println("Tempo gasto for 2: " + tempo);
	}
}
