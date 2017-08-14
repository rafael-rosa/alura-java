import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteEntradaPadrao {
	public static void main(String[] args) throws IOException {

		//InputStream is = System.in; //Leitura da entrada padrão\
		
		BufferedReader br = new BufferedReader( //Leitura de arquivo.
								new InputStreamReader(
									new FileInputStream("leitura.txt")));
		
		String s = br.readLine();
		
		while(s != null){
			
			System.out.println(s);
			s = br.readLine();
			
		}
		br.close();
	}
}
