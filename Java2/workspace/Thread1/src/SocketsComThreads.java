import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketsComThreads implements Runnable {

	private ServerSocket servidor;
	private Socket cliente;
	
	public SocketsComThreads(int port) throws IOException {
		servidor = new ServerSocket(port);
		cliente = servidor.accept();		
	}

	@Override
	public void run() {
		while (true) {
			Scanner s;
			try {
				s = new Scanner(this.cliente.getInputStream());
				while (s.hasNextLine()) {
					System.out.println(s.nextLine());
				}
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}		
		}
	}

}
