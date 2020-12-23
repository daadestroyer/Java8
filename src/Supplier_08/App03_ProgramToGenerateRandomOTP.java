package Supplier_08;

import java.util.function.Supplier;

public class App03_ProgramToGenerateRandomOTP {
	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String otp = "";
			for (int i = 0; i < 6; i++) {
				otp += (int)(Math.random() * 10);
			}
			return otp;
		};
		System.out.println(s.get());
	}
}

/*
846493
679370
179415
254522
985966

*/
 