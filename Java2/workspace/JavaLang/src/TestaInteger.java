
public class TestaInteger {
	public static void main(String[] args) {

		Integer x1 = new Integer(10);
	    Integer x2 = new Integer(10);
	    Integer x3 = Integer.parseInt("aaa");
	    
	    if (x1.equals(x2)) {
	        System.out.println("igual");
	    } else {
	        System.out.println("diferente");
	    }
		
	    
	    System.out.println(x3);
	}
}
