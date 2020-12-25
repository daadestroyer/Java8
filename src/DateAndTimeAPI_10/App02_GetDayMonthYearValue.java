package DateAndTimeAPI_10;

import java.time.LocalDate;

public class App02_GetDayMonthYearValue {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		int DD = date.getDayOfMonth();
		int MM = date.getMonthValue();
		int YY = date.getYear();

		System.out.println(DD + "-" + MM + "-" + YY);


	}
}
