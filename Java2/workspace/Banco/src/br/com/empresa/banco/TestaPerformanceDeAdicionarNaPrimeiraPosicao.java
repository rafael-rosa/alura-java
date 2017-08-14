package br.com.empresa.banco;

import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {
	public static void main(String[] args) {
	
		System.out.println("Iniciando...");
		long inicio = System.currentTimeMillis();
		
		List<Integer> lista = new LinkedList<Integer>();
		//List<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < 30000; i++) {
			lista.add(0,i);
		}
		
		long fim = System.currentTimeMillis();
		double tempo = (fim - inicio) / 1000.0;
		
		System.out.println("tempo gasto: " + tempo);
		
	}
}
