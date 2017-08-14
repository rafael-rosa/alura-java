/*public class IncrementaVariavel implements Runnable{

    private static int total = 0;
    private static int incremento = 1;

    public static void main(String[] args) {
    	IncrementaVariavel instancia = new IncrementaVariavel();
    	
        new Thread(instancia).start();
        new Thread(instancia).start();
        new Thread(instancia).start();
        new Thread(instancia).start();
        new Thread(instancia).start();
    }

    @Override
    public synchronized void run() {
        for(int i=0; i<1000; i++){
            total += incremento;
            incremento++;
            System.out.println(total + "-" + incremento );
        }
    }
}*/

//Resposta professor

public class IncrementaVariavel implements Runnable{

    private static int total = 0;
    private static int incremento = 1;

    public static void main(String[] args) {
        new Thread(new IncrementaVariavel()).start();
        new Thread(new IncrementaVariavel()).start();
        new Thread(new IncrementaVariavel()).start();
        new Thread(new IncrementaVariavel()).start();
        new Thread(new IncrementaVariavel()).start();
    }

    @Override
    public void run() {
        for(int i=0; i<1000; i++){
            synchronized (IncrementaVariavel.class)/*Mesmo resultado que usar o this*/ {
                total += incremento;
                incremento++;
                System.out.println(total + "-" + incremento );
            }
        }
    }
}