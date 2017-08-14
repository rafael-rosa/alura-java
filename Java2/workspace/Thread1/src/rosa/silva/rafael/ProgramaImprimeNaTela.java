package rosa.silva.rafael;

import rosa.silva.rafael.threads.ImprimeIdThread;

public class ProgramaImprimeNaTela {
	
	public static void main(String[] args) {
	
		Thread[] listaThreads = new Thread[2];
		listaThreads[0] = new Thread(new ImprimeIdThread());
		listaThreads[1] = new Thread(new ImprimeIdThread());
		
		listaThreads[0].start();
		listaThreads[1].start();
	}	
}
