package Consumer_07;

import java.util.Scanner;
import java.util.function.Consumer;

class Movies {

	String movie;
	String result;

	public Movies(String movie, String result) {
		this.movie = movie;
		this.result = result;
	}
}

public class App03_ConsumerChaining {
	public static void main(String[] args) {

		Consumer<Movies> c1 = m -> System.out.println("Movie " + m.movie + " is ready to release");

		Consumer<Movies> c2 = m -> System.out.println("Movie is " + m.result);

		Consumer<Movies> c3 = m -> System.out.println("Movie " + m.movie + " information is storing in database");

		Consumer<Movies> chainedC = c1.andThen(c2).andThen(c3);

		Movies m1 = new Movies("Bahubali", "Hit");
		chainedC.accept(m1);
		System.out.println();
		Movies m2 = new Movies("Spider", "Flop");
		chainedC.accept(m2);
		
		
	}

}
