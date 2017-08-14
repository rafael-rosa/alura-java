package br.com.empresa.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(1,"Karina");
		Conta c2 = new ContaCorrente(2,"Rafael");
		Conta c3 = new ContaCorrente(3,"Arlene");
		
		c1.deposita(500);
		c2.deposita(1000);
		c3.deposita(1500);
		
		Map<String, Conta> listaContas = new HashMap<String, Conta>();
		
		listaContas.put("gerente", c1);
		listaContas.put("diretor", c2);
		listaContas.put("diretor", c3);
		
		Conta contaDiretor = listaContas.get("diretor");
		System.out.println(contaDiretor.getNome());		
	}

}
