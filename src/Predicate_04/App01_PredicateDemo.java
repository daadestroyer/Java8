package Predicate_04;
// Predicate is a single arguement function which perform conditional check and return boolean values as a result
import java.util.function.Predicate;

public class App01_PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> predicate = (i) -> i > 10; // Predicate to check no is greater than 10 or not
		Predicate<String> predicate2 = (s) -> s.length() > 0; // Predicate to check length of string is greater then zero or not
		Predicate<Integer> predicate3 = (i) -> i % 2 == 0;
		
		
		System.out.println(predicate.test(40));
		System.out.println(predicate2.test("Shubham"));
		System.out.println(predicate3.test(5));
	
	
	
	
	}
}
