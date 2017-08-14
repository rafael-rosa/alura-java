import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TestaLocalDate {
	public static void main(String[] args) {
		LocalDate future = LocalDate.of(2099, Month.JANUARY, 25);
		Period periodo = Period.between(LocalDate.now(), future);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate now = LocalDate.now();
		System.out.println(now.format(formatter));
		
		System.out.println(future.format(formatter));
		System.out.println(periodo.getYears());
	}
}
