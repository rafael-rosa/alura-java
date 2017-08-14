package br.com.empresa.banco;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();
		Random rd = new Random();
		ContaPoupanca cp1 = new ContaPoupanca(rd.nextInt(100),"Joao");
		ContaPoupanca cp2 = new ContaPoupanca(rd.nextInt(100),"Maria");
		ContaPoupanca cp3 = new ContaPoupanca(rd.nextInt(100),"Camila");
						
		contas.add(cp3);
		contas.add(cp1);
		contas.add(cp2);
		
		Collections.sort(contas);
		
		System.out.println(contas);
		
		for (ContaPoupanca cp : contas) {
			System.out.println(cp.getNome());
		}
		
	}
}
