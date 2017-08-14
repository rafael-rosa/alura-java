
public class ImprimeStringInvertida {
	public static void main(String[] args) {
		
		String str = "Socorram-me, subi no ônibus em Marrocos";
		
		String[] arrayStr = str.split(" ");
		
		for (int i = arrayStr.length-1; i >= 0; i--) {
			String s = arrayStr[i];
			
			System.out.print(s+" ");
		}
	}
}
