package chaptor10;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Exam4Main {

	public static void main(String[] args) {

		LocalDate birthday = LocalDate.of(2023, 3, 3);
		LocalDate now = LocalDate.now();
		System.out.println("오늘 : " + now);
		System.out.println("생일 : " + birthday);
		
		long days = ChronoUnit.DAYS.between(birthday, now);
		System.out.println(days);

		LocalDate cDay = LocalDate.parse("2023-12-25");
		System.out.println("크리스마스 : " + cDay);
		long days2 = ChronoUnit.DAYS.between(now, cDay);
		System.out.println(days2);
	}

}
