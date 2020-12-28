package DateAndTimeAPI_10;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class App06_Period {
	public static void main(String[] args) {
		LocalDate birthDate = LocalDate.of(1998, Month.OCTOBER, 14);
		LocalDate todayDate = LocalDate.now();
		Period period = Period.between(birthDate, todayDate);
		System.out.printf("Age is %d Years %d Months %d Days", period.getYears(), period.getMonths(), period.getDays());
		System.out.println();

		LocalDate deathDate = LocalDate.of(1998 + 60, Month.OCTOBER, 14);
		Period p1 = Period.between(todayDate, deathDate);
		int d = p1.getYears() * 365 + p1.getMonths() * 30 + p1.getDays();
		System.out.printf("You wil be on earth only at %d Days Hurry Up to do more important things", d);
	}
}
