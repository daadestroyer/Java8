package DateAndTimeAPI_10;

import java.time.Year;
import java.util.Scanner;

public class App07_Year {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter year number");
		int n = scanner.nextInt();
		Year year = Year.of(n);
		
		if(year.isLeap()) {
			System.out.printf("%d Year is a leap year ",n);
		}
		else {
			System.out.printf("%d Year is not a leap year ",n);
		}
	}
}
