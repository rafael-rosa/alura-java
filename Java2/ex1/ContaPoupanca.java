class ContaPoupanca extends Conta{
		
	public void atualiza(double taxa){
		this.saldo += this.saldo * (taxa * 3);
	}
	
	public void deposita(double valor){
		this.saldo += valor;
		this.saldo -= 0.1;
	}
}