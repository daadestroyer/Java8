package DateAndTimeAPI_10;

import java.time.LocalDate;
import java.time.LocalTime;

public class App01_GetCurrentSystemDateAndTime {
	public static void main(String[] args) {
		// getting current system date
		LocalDate date = LocalDate.now();
		System.out.println(date);

		// getting current system time
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}
}
