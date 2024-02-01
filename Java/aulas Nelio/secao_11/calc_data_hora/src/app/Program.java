package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Program {
	public static void main(String[] args) {
		
		LocalDate d = LocalDate.now();
		LocalDateTime dt = LocalDateTime.now();
		Instant it = Instant.now();
		
		LocalDate pastWeekLocalDate = d.minusDays(7);
		LocalDate nextWeekLocalDate = d.plusDays(7);
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		System.out.println("semana passada: "+ pastWeekLocalDate.format(fmt1));
		System.out.println("semana que vem: "+ nextWeekLocalDate.format(fmt1));
		
		
		Instant pastWeekInstant = it.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = it.plus(7, ChronoUnit.DAYS);
		
		System.out.println("semana passada: "+ pastWeekInstant);
		System.out.println("semana que vem: "+ nextWeekInstant);
		
		LocalDateTime pastweekDateTime = dt.minus(7, ChronoUnit.DAYS);
		LocalDateTime nextDateTime = dt.plus(7, ChronoUnit.DAYS);
		
		Duration t01 = Duration.between(pastweekDateTime, dt);
		System.out.println(t01.toDays());
		Duration t02 = Duration.between(pastWeekLocalDate.atTime(0, 0), d.atTime(0, 0)); //como declarar sem horario no tipo de declaração
		System.out.println(t02.toDays());
		System.out.println(nextDateTime);
	}

}
