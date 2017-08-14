
public class ThreadLambda {
	public static void main(String[] args) {
		/*new Thread(new Runnable() { classe abstrata

		    @Override
		    public void run() {
		        System.out.println("Executando um Runnable");
		    }

		}).start();
		
		
		Runnable t = () -> System.out.println("Thread!");
		new Thread(t).start();*/
		
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}
