
public class CalculadorDeDescontos {
	public double calcula(Orcamento orcamento){
		Desconto d1 = new DescontoParaCincoItens();
		Desconto d2 = new DescontoAcimaDeQuinhentosReais();
		Desconto d3 = new SemDesconto();
		Desconto d4 = new DescontoPorVendaCasada();
				
		
		d1.setProximo(d2);
		d2.setProximo(d4);
		d4.setProximo(d3);
		
		return d1.desconta(orcamento);
	}
}
