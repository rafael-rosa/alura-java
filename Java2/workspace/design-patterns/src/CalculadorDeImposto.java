
public class CalculadorDeImposto {
	
	public void executaCalculo(Orcamento orcamento, Imposto imposto){
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}
}
