
public class TesteDeDescontos {
	public static void main(String[] args) {
		CalculadorDeDescontos descontos = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(100);
		orcamento.adicionaItem(new Item("caneta",10.00));
		orcamento.adicionaItem(new Item("l�pis",450.00));
		orcamento.adicionaItem(new Item("Palet�",450.00));
		orcamento.adicionaItem(new Item("Palet�",450.00));
		
		System.out.println(descontos.calcula(orcamento));
	}
}