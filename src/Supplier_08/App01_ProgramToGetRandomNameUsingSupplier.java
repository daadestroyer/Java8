package Supplier_08;

import java.util.function.Supplier;

public class App01_ProgramToGetRandomNameUsingSupplier {
	public static void main(String[] args) {
		Supplier<String> S = () -> {
			String[] s1 = { "Sunny", "Bunny", "Chinny", "Pinny" };
			int x = (int) (Math.random() * 4);
			return s1[x];
		};
		System.out.println(S.get());
		System.out.println(S.get());
		System.out.println(S.get());
	}
}
/*
Bunny
Pinny
Chinny

Pinny
Bunny
Bunny

Sunny
Sunny
Bunny

Chinny
Sunny
Pinny

Pinny
Sunny
Pinny


*/
