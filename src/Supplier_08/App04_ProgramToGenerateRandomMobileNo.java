package Supplier_08;

import java.util.function.Supplier;

public class App04_ProgramToGenerateRandomMobileNo {
	public static void main(String[] args) throws InterruptedException {
		Supplier<String> India = () -> {
			String mobileno = "+91-";
			for (int i = 0; i < 10; i++) {
				mobileno += (int) (Math.random() * 10);
			}
			return mobileno;
		};

		Supplier<String> USA = () -> {
			String mobileno = "+1-";
			for (int i = 0; i < 10; i++) {
				mobileno += (int) (Math.random() * 10);
			}
			return mobileno;
		};

		Supplier<String> Japan = () -> {
			String mobileno = "+81-";
			for (int i = 0; i < 10; i++) {
				mobileno += (int) (Math.random() * 10);
			}
			return mobileno;
		};

		System.out.println("Generating India Phone no");
		for (int i = 0; i < 5; i++) {
			System.out.println(India.get());
			Thread.sleep(500);
		}
		System.out.println();
		
		System.out.println("Generating USA Phone no");
		for (int i = 0; i < 5; i++) {
			System.out.println(USA.get());
			Thread.sleep(500);
		}
		System.out.println();
		
		System.out.println("Generating Japan Phone no");
		for (int i = 0; i < 5; i++) {
			System.out.println(Japan.get());
			Thread.sleep(500);
		}
		System.out.println();
	}
}
/*

 */
