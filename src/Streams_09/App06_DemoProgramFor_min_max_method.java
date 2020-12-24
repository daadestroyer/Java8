package Streams_09;

import java.util.ArrayList;
import java.util.List;

public class App06_DemoProgramFor_min_max_method {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(1);
		al.add(5);
		al.add(8);

		// sort karne ke baad min nikal liya
		int min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		int max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min + " " + max);

	}
}
