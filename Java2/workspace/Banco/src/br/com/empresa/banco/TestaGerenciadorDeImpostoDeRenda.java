package br.com.empresa.banco;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.banco.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		
		GerenciadorDeImpostoDeRenda ger = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		
		ger.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente(1,"B");
		cc.deposita(1000);
		ger.adiciona(cc);
		
		System.out.printf("O total é: %.2f",ger.getTotal());
		
	}
}
