
public class TestaString {
	public static void main(String[] args) {
		String s = "       anotaram a data da maratona";
		/*s = s.replaceAll("1", "2");
		
		if(s.contains("3"))
			System.out.println("achei");
		
		if (s.isEmpty()) {
			System.out.println("vazio");
		}
		
		s = s.trim();
		System.out.println(s.length());
		*/
		ImprimeString i = new ImprimeString();
		
		i.imprimeString(s);
	}
}
