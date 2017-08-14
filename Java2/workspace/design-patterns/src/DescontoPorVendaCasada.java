
public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		if (existe("caneta", orcamento) && existe("l�pis", orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;

	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

}
