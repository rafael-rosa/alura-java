
public class Teste {
	public static void main(String[] args) {
		
		Programa p1 = new Programa();
		p1.setId(111);
		Thread t1 = new Thread(p1);
		t1.start();
		
		Programa p2 = new Programa();		
		p2.setId(555);		
		Thread t2 = new Thread(p2);
		t2.start();
		
	}
}
