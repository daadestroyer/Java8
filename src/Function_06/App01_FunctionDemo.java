package Function_06;

import java.util.function.Function;

public class App01_FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> f1 = s->s.length();
		Function<String, Boolean> f2 = s->s.length()>5;
		
		System.out.println(f1.apply("shubham"));
		System.out.println(f1.apply("nigam"));
		
		System.out.println(f2.apply("shubham"));
		System.out.println(f2.apply("nigam"));
	}
}
