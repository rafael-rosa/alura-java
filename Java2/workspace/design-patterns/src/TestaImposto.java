
public class TestaImposto {
	public static void main(String[] args) {
		Imposto iss = new ICCC();
		Orcamento orcamento = new Orcamento(10000.00);
		CalculadorDeImposto calc = new  CalculadorDeImposto();
		
		calc.executaCalculo(orcamento , iss);

	}
}