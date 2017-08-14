import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AprendendoStream {

	public static void main(String[] args) {
	
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python",45));
		cursos.add(new Curso("JavaScript",150));
		cursos.add(new Curso("Java 8",113));
		cursos.add(new Curso("C",55));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		Stream<Curso> streamDeCurso = cursos.stream();
		streamDeCurso.filter(c -> c.getAlunos() > 50)
			.map(Curso::getNome)
			.forEach(System.out::println);

		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		Optional<Curso> optCurso = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findFirst();
		
		optCurso.ifPresent(c -> System.out.println(c.getNome()));
		
		//Obtendo a média de alunos dos cursos
		cursos.stream()
			.mapToDouble(Curso::getAlunos)
			.average()
			.ifPresent(System.out::println);

		//Transformando Stream em List
		List<Curso> cursosFiltrados = cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList());
		
		cursosFiltrados.forEach(c -> System.out.println(c.getNome()));
	}
	
}
