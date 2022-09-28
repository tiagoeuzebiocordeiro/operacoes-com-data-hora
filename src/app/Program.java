package app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r2 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());

		System.out.println("LONDRES: " + d06);
		System.out.println("NESSA HORA, O DIA NO BRASIL É = " + r1);
		System.out.println("R2 (DATA+HORARIO) = " + r2);
		System.out.println("D4 dia = " + d04.getDayOfMonth());
		System.out.println("D4 mês = " + d04.getMonth() + " ,NUM MÊS = " + d04.getMonthValue());
		System.out.println("YEAR: " + d04.getYear());
		/*---------------------------------------*/
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		System.out.println("nextWeekLocalDate: "+nextWeekLocalDate);
		System.out.println("pastWeekLocalDate: "+pastWeekLocalDate);
		/*---------------------------------------*/
		System.out.println();
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		System.out.println("nextWeekLocalDateTime: "+nextWeekLocalDateTime);
		System.out.println("pastWeekLocalDateTime: "+pastWeekLocalDateTime);
		/*---------------------------------------*/
		System.out.println();
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekIstant: "+nextWeekInstant);
		System.out.println("pastWeekInstant: "+pastWeekInstant);
		
		
		//Duration:
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		System.out.println("T1 [dias]= " + t1.toDays());
		System.out.println("T1 [horas]= " + t1.toHours());
		
		System.out.println();
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		System.out.println("T2 [dias]= " + t2.toDays());
		System.out.println("T2 [horas]= " + t2.toHours());
		
		Duration t3 = Duration.between(pastWeekInstant, d06);
		System.out.println("T3 Dias = " + t3.toDays());
		
		
		
	}

}
