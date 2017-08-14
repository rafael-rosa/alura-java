
public class ConverteCharToInt {
	public static void main(String[] args) {
		
		String s = "762";
		int num = 0;
		int multiplic = 1;
		
		for (int i = s.length()-1; i >= 0 ; i--) {
			char c = s.charAt(i);
			int aux = (c - '0') * multiplic;
			num = num + aux;
			multiplic = multiplic * 10;
		}
		
		System.out.println(num);
		
	}
}
