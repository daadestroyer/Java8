package Predicate_04;

import java.util.function.Predicate;

public class App02_WAPToDisplayNamesStartWith_S {

	static void m1(Predicate<String> p, String[] s) {
		for (String S : s) {
			if (p.test(S)) {
				System.out.print(S +"-");
			}
		}
	}

	public static void main(String[] args) {
		Predicate<String> p = (s) -> s.charAt(0) == 's';
		m1(p, new String[] { "sakshi", "shubham", "shubhanshu", "kshitij", "yash" });
	}
}
