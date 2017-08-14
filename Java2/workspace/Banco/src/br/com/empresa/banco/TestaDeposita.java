package br.com.empresa.banco;
import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaDeposita {
	public static void main(String[] args) {

		Conta cc = new ContaCorrente(1,"A");
		
		try {
			cc.deposita(-1);	
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Outro erro.");
		}
		
		
	}
}
