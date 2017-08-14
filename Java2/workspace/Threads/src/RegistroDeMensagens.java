import java.util.Collection;
import java.util.Vector;

public class RegistroDeMensagens {

	public static void main(String[] args) throws InterruptedException {
		Collection<String> mensagens = new Vector<>();

		Thread t1 = new Thread(new ProduzMensagens(0, 10000, mensagens));
		Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
		Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
		
		t1.start();
		t2.start();
		t3.start();
		
		//Faz a Thread que roda o main aguardar estas threads para concluir
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("threads finalizadas");
		
		//Verifica se todas as mensagens foram guardadas
		for (int i = 0; i < 15000; i++) {
			if(!mensagens.contains("Mensagem:" + i)){
				throw new IllegalStateException("Não encontrei a mensagem " + i);
			}
		}
		
		if(mensagens.contains(null))
			throw new IllegalStateException("Não devia ter null");
		
		
		System.out.println("Fim");
	}

}
