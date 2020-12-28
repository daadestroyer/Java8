package DateAndTimeAPI_10;

import java.time.LocalDateTime;
import java.time.Month;

public class App05_GetLocalDateTime_02 {
	public static void main(String[] args) {
		LocalDateTime ld = LocalDateTime.of(1998, Month.OCTOBER, 14, 12, 45);
		System.out.println(ld);
		
		System.out.println("After 6 months "+ld.plusMonths(6));
		System.out.println("Before 6 months "+ld.minusMonths(6));
	}
}
