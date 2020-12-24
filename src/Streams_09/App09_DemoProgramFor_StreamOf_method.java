package Streams_09;

import java.util.stream.Stream;

public class App09_DemoProgramFor_StreamOf_method {
	public static void main(String[] args) {

		// stream concept for group of values
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		s.forEach(i -> System.out.println(i));
		
		System.out.println();
		 
		// Stream concept for array
		Integer[] ar = {1,2,3,4,5,6};
		Stream<Integer> s1 = Stream.of(ar);
		s1.forEach(i->System.out.println(i));
		 

	}
}
