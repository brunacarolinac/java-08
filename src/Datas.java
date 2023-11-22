import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		
		LocalDate olimpiadasParis = LocalDate.of(2024, Month.JULY, 2);
		
		int anos = olimpiadasParis.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasParis);
		
		LocalDate proximasOlimpiadas = olimpiadasParis.plusYears(4);
		
		System.out.println(proximasOlimpiadas);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String valorFormatador = proximasOlimpiadas.format(formatador);
		System.out.println(valorFormatador);
		
		DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorComHoras));
		
		LocalTime intervalo = LocalTime.of(15, 30);
		System.out.println(intervalo);
		
	}
	
}
