package br.com.empresa.banco;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TesteTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<Integer>();
		
		for (int i = 0; i < 1001; i++) {
			numeros.add(i);			
		}
		
		NavigableSet<Integer> y = numeros.descendingSet();
		Iterator<Integer> it = y.iterator();

		while (it.hasNext()) {
			Integer valor = (Integer) it.next();
			System.out.println(valor);
			
		}
		
		/*Resposta oficial
                for (Integer i : conjunto.descendingSet()) {
                    System.out.print(i + " ");
                }
		 */
				
	}
}
