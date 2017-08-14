import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class TesteScanner {
	public static void main(String[] args) throws FileNotFoundException {
		InputStream is = new FileInputStream("leitura.txt");
		Scanner scanner = new Scanner(is); //System.in Editor de texto
		PrintStream ps = new PrintStream("saida.txt");
		System.out.println(scanner.delimiter()); //Com delimiter você consegue alterar o delimitador de linhas

		while (scanner.hasNextLine()) {
			//System.out.println(scanner.nextLine());
			ps.println(scanner.nextLine());
		}
		scanner.close();
		ps.close();
	}
}
