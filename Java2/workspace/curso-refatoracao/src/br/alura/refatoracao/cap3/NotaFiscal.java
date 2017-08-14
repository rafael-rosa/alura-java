package br.alura.refatoracao.cap3;

public class NotaFiscal {

	private int id;
	private double valorBruto;
	private double impostos;

	public NotaFiscal(int id, double valorBruto) {
		this.id = id;
		this.valorBruto = valorBruto;
	}

	public NotaFiscal(double valorBruto) {
		this(0, valorBruto);
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}
	public double getImpostos() {
		
		double valor = this.valorBruto;
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}
		
		return imposto;
	}

	public double getValorLiquido() {
		return this.valorBruto - this.impostos;
	}

}