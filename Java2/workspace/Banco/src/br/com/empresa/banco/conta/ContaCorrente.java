package br.com.empresa.banco.conta;

/**
 * 
 * @author rafael
 *
 */
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int numero, String nome) {
		super(numero, nome);
		// TODO Auto-generated constructor stub
	}

	public void atualiza(double taxa){
		this.saldo += this.saldo * (taxa * 2);
	}

	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0) {
			//throw new ValorInvalidoException(valor);
			throw new OutOfMemoryError();
		}
		
		this.saldo += valor;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
	
}
