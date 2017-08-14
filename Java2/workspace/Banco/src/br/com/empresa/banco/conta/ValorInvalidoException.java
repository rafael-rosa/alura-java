package br.com.empresa.banco.conta;


public class ValorInvalidoException extends RuntimeException{
	private double valor;

	public ValorInvalidoException (double valor){
		super("Não é permitido depositar valores negativos: " + valor);
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
}
