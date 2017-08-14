package br.com.empresa.banco.sistema;
import br.com.empresa.banco.conta.Tributavel;

public class GerenciadorDeImpostoDeRenda {
	private double total = 0;
	
	public void adiciona (Tributavel t){
		System.out.println("Adicionando o tributável "+t);
		
		this.total += t.calculaTributos();
		
	}

	public double getTotal() {
		return total;
	}

	
}
