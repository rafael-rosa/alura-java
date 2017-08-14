package rosa.silva.rafael.threads;

public class ImprimeIdThread implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getId() + "  -  " + i);
		}
		
	}
	
}
