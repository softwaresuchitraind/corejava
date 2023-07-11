package in.suklak;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateExample
{
	public static void main(String[] args)
	{
		
		ZonedDateTime currentTimeinIndia = ZonedDateTime.now();
		System.out.println("Current time in India  "+currentTimeinIndia);
		
		
		ZonedDateTime instantINUTC =
				currentTimeinIndia.withZoneSameInstant(ZoneId.of("America/New_York"));
		
		System.out.println(instantINUTC);
		//LocalDate d =LocalDate.now();
		/*LocalDateTime d =LocalDateTime.now();
		System.out.println(d);
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		System.out.println(d.plusDays(31));
		System.out.println(d.plusDays(-31));
		System.out.println(d.plusDays(-31));
		
		LocalDateTime d1 = LocalDateTime.of(1987, Month.JUNE, 12, 01, 01);
		System.out.println(d1);
		
		Duration dur = Duration.between(d, d1);
		System.out.println(dur.toDays());
		
		DateTimeFormatter d5 = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		
		String dateTime="2020-12-11";*/
		//LocalDate formatDateTime=LocalDate.parse(dateTime,d5);
		//System.out.println(formatDateTime);
		
		
	}
}
