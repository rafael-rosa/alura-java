package br.alura.refatoracao.cap4;

public abstract class ContaBancaria {
	protected String titular;
	protected double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void deposita(double valor,double taxa){
		this.saldo += valor - taxa;
	}
	
	public void saca(double valor, double taxa){
		this.saldo -= valor + taxa;		
	}
	
	public String getTitular() {
		return titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	
}
