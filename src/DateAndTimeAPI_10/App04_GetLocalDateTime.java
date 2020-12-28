package DateAndTimeAPI_10;

import java.time.LocalDateTime;

public class App04_GetLocalDateTime {
	public static void main(String[] args) {
			LocalDateTime lDateTime = LocalDateTime.now();
			System.out.println(lDateTime);
			
			int dayOfMonth = lDateTime.getDayOfMonth();
			int monthValue = lDateTime.getMonthValue();
			int year = lDateTime.getYear();
			System.out.println(dayOfMonth+"-"+monthValue+"-"+year);
			
			int hour = lDateTime.getHour();
			int minute = lDateTime.getMinute();
			int second = lDateTime.getSecond();
			int nano = lDateTime.getNano();
			System.out.println(hour+"-"+minute+"-"+second+"-"+nano);
	}
}
