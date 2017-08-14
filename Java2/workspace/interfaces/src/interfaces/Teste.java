package interfaces;

public class Teste {

	public static void main(String[] args) {
		AreaCalculavel a = new Retangulo(2, 5);
		AreaCalculavel c = new Circulo(10);
		
		System.out.println(a.calculaArea());
		System.out.println(c.calculaArea());
	}
}
