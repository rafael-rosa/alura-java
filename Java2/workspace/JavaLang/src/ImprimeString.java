
public class ImprimeString {
	StringBuilder sb = new StringBuilder();
	
	public void imprimeString(String s){
		for (int i = s.length()-1; i >= 0; i--) {
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
	}
}
