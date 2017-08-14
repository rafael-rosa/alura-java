package br.com.empresa.banco;

import java.util.HashSet;
import java.util.Set;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaHashConta {
	public static void main(String[] args) {

		Conta c1 = new ContaCorrente(1,"camila");
		Conta c2 = new ContaCorrente(1,"camila");		
		
		//Set não permite objetos repetidos
		Set<Conta> contas = new HashSet<Conta>();
		
		contas.add(c1);
		contas.add(c2);
		
		System.out.println(contas.size());
		
	}
}
