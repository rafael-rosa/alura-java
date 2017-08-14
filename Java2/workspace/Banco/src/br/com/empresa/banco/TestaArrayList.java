package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.Collections;

public class TestaArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 0; i < 1001; i++) {
			numeros.add(i);			
		}
		//Resposta correta
		Collections.reverse(numeros);
		
		/*Minha ideia
		for (int i = 0; i < 1000; i++) {
			numeros.add(i, numeros.get(numeros.size()-1));
			numeros.remove(numeros.size()-1);
		}*/
		
		for (Integer i : numeros) {
			System.out.println(i);
		}

		
	}
}
