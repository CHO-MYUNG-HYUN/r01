package chaptor9;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		System.out.println(now);
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());
		System.out.println(now.getDayOfMonth());
		
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1);
		LocalDate nextDay2 = now.plusMonths(1);
		System.out.println(nextDay2);
		LocalDate nextDay3 = now.plusYears(1);
		System.out.println(nextDay3);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		System.out.println(now2.getHour());
		System.out.println(now2.getMinute());
		System.out.println(now2.getSecond());
		
		LocalDate now3 = LocalDate.of(2023, 12, 25);
		System.out.println(now3);
		
		LocalDateTime now4 = LocalDateTime.of(2023, 6, 3, 17, 50, 30);
		System.out.println(now4);
		
		LocalDate now5 = LocalDate.parse("2024-12-25");
		System.out.println(now5);

	}

}
