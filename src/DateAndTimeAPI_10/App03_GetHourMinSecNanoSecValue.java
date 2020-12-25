package DateAndTimeAPI_10;

import java.time.LocalTime;

public class App03_GetHourMinSecNanoSecValue {
	public static void main(String[] args) {
			LocalTime time = LocalTime.now();
			System.out.println(time);
			
			int hour = time.getHour();
			int minute = time.getMinute();
			int second = time.getSecond();
			int nano = time.getNano();
			
			System.out.println(hour+"-"+minute+"-"+second+"-"+nano );
	}
}
