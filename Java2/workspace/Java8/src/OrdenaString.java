import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import static java.util.Comparator.comparing;

public class OrdenaString {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		
		palavras.add("caelum");
		palavras.add("alura online");
		palavras.add("Editora casa do código");
		
		/*Classe anônima
		 * palavras.sort(new Comparator<String>(){

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() < s2.length())
					return -1;
				if(s1.length() > s2.length())
					return 1;
				return 0;
			}
			
		});*/
		
		//uso do lambda
		/*palavras.sort((s1,s2) -> Integer.compare(s1.length(), s2.length()));
		
		//Equivalente
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Equivalente
		Function<String,Integer> funcao = String::length;
		palavras.sort(Comparator.comparing(funcao));*/
		
		//Equivalente - Method reference
		palavras.sort(comparing(String::length));
				
		/*System.out.println(palavras.get(0).hashCode());
		System.out.println(palavras.get(1).hashCode());
		System.out.println(palavras.get(2).hashCode());*/
		
		//Equivalente - Method reference - Organizando pelo hashCode
		palavras.sort(comparing(String::hashCode));
		
		//Equivalente - Method reference - Sugestao do professor
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
				
		
/*		Consumer<String> imprimeString = new ImprimeString();
		palavras.forEach(imprimeString);*/
		
		//Outra opção - Classe anônima
		/*palavras.forEach(new Consumer<String>(){
		    public void accept(String palavra) {
		        System.out.println(palavra);
		    }
		});*/
		
		
		//Uso do lambda
		//palavras.forEach((String s) -> {System.out.println(s);});
		
		//Uso do lambda - mais sucinto
		/*palavras.forEach(s -> System.out.println(s));*/
		
		//Usando method reference - Method reference só pode ser usado quando é um lambda muito simples.
		palavras.forEach(System.out::println);
	}

}

/*class ImprimeString implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
}*/