package br.com.empresa.banco.conta;


public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atualiza(double taxa){
		this.saldo += this.saldo * (taxa * 3);
	}
	
	public void deposita(double valor) throws ValorInvalidoException{
		if (valor < 0) {
			throw new ValorInvalidoException(valor);
		}
		
		this.saldo += valor - 0.1;
	}


	@Override
	public int compareTo(Conta o) {
		return this.getNome().compareTo(o.getNome());
	}

	
}
