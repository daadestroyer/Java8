package Supplier_08;

import java.util.function.Supplier;

/*
 RULES
 ------
 1. Length should be 8 character
 2. 2 4 6 8 places only digit
 3. 1 3 5 7 places only upper case alphabet symbols + @ # $
 
 U_S d U_S d U_S d U_S d 
*/
public class App05_ProgramToGenerateRandomPassword {
	public static void main(String[] args) {

		Supplier<Integer> d = () -> (int) (Math.random() * 10);

		String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";

		Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));

		Supplier<String> generatePassword = ()->{
			String pswd = "";
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0) {
					pswd += d.get();
				} else {
					pswd += c.get();
				}
			}
			return pswd;
		};

		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
		System.out.println(generatePassword.get());
	}
}


/*
U9R7$8@7
Q7#3P5G5
N5P6Q8D3
O8W2F1R6
L7$9Z6K3
#1O8B7Y5



*/
