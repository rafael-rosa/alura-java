package rosa.silva.rafael.threads;

public class IncrementaVariavelThread implements Runnable{
	private static Integer soma = 0;

	public static Integer getSoma() {
		return soma;
	}

	@Override
	public synchronized void run() {		
		for (int i = 0; i < 10; i++) {
			soma = soma+1;
		}
		if(soma == 20){ //Só pode notificar se as duas threads já incrementaram
			this.notify();
		}
		
	}
	
}
