package rosa.silva.rafael;

import rosa.silva.rafael.threads.IncrementaVariavelThread;

public class ProgramaIncrementaVariavel {
	
	public static void main(String[] args) throws InterruptedException {
		IncrementaVariavelThread incrementa = new IncrementaVariavelThread();
		
		new Thread(incrementa).start();
		new Thread(incrementa).start();
		
		//Thread.sleep(5000); - o Wait resolve este problema
		
		synchronized (incrementa) {
			if(IncrementaVariavelThread.getSoma() < 20)
				incrementa.wait(5000);
			
			System.out.println(IncrementaVariavelThread.getSoma());
		}
	}
	
}


//Resposta do professor
/*
public class Sincronizacao {

    public static Integer variavel = 0;

    public static void main(String[] args) throws InterruptedException {
        Incrementador i1 = new Incrementador();
        Incrementador i2 = new Incrementador();

        new Thread(i1).start();
        new Thread(i2).start();

        synchronized (i1) {
            if(!i1.executou){
                i1.wait();
            }
            synchronized (i2) {
                if(!i2.executou){
                    i2.wait();
                }
                System.out.println(variavel);
            }
        }
    }
}

public class Incrementador implements Runnable {

    public boolean executou = false;

    @Override
    public void run() {
        synchronized(this){
            Sincronizacao.variavel += 10;
            executou = true;
            this.notify();
        }
    }
}
 * */
