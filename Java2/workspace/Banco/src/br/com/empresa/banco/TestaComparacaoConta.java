package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {
	
	public static void main(String[] args) {
	
		Conta cc = new ContaCorrente(123,"Joao");
		Conta cp = new ContaCorrente(123,"Joao");
		
		/*cc.setNumero(123);
		cp.setNumero(123);
		cc.setNome("Joao");
		cp.setNome("Joao");*/
		
		if(cc.equals(cp))
			System.out.println("iguais");
		else
			System.out.println("diferentes");
		
		if(cc == cp)
			System.out.println("iguais");
		else
			System.out.println("diferentes");
		
	}	
	
}
