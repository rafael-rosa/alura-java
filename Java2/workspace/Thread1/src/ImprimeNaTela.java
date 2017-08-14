
public class ImprimeNaTela {
	public static void main(String[] args) {
		
		new Thread(new Runnable(){

			@Override
			public void run() {
				System.out.println("Imprimindo na tela...");				
			}			
		}).start();		
	}
}
