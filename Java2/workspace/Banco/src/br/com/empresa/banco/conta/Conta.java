package br.com.empresa.banco.conta;

/**
 * Modelo de conta
 * @author rafael
 *
 */

abstract public class Conta implements Comparable<Conta>{
	protected double saldo;
	private int numero;
	private String nome;

	abstract public void atualiza(double taxa);
	abstract public void deposita(double valor) throws ValorInvalidoException;
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	/**
	 * Realiza um saque dado o valor
	 * @param valor valor a ser sacado
	 * @return
	 */
	public boolean saca(double valor) {
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
	}
	/**
	 * Retorna o saldo
	 * @return
	 */
	public double getSaldo() {

		return this.saldo;
	}
	
	@Override
	public String toString() {
		return "Conta com saldo R$" + this.saldo;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Conta){
			Conta c = (Conta) obj;
			return c.numero == this.numero && c.nome.equals(this.nome);
		}else
			return false;
	}*/
	
	public int getNumero() {
		return numero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Conta))
			return false;
		Conta other = (Conta) obj;
		if (numero != other.numero)
			return false;
		return true;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public int compareTo(Conta o) {
		return this.getNumero() - o.getNumero();
	}
	
	
	
}
