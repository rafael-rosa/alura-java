package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	private List<Conta> listaContas = new ArrayList<>();;
	private Map<String, Conta> mapaContas = new HashMap<String,Conta>();
	
	public void adiciona (Conta c){
		listaContas.add(c);
		mapaContas.put(c.getNome(),c);
	}
	
	public Conta pega(int x){
		return listaContas.get(x);		
	}
	
	public int pegaQuantidadeDeContas(){
		return listaContas.size();
	}
	
	public Conta buscaPorNome(String nome){
		return mapaContas.get(nome);
	}
}
