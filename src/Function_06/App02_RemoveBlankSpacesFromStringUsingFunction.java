package Function_06;

import java.util.Scanner;
import java.util.function.Function;

public class App02_RemoveBlankSpacesFromStringUsingFunction {
	public static void main(String[] args) {

		Function<String, String> f1 = s -> s.replaceAll(" ", "");
		Function<String, Integer> f2 = s1 -> s1.length() - s1.replaceAll(" ", "").length();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s = scanner.nextLine();

		System.out.println(f1.apply(s));

		System.out.println(f2.apply(s));

	}
}
