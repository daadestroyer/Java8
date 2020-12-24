package Streams_09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App05_DemoProgramFor_sorted_method {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(1);
		al.add(5);
		al.add(8);

		// sorting done based on default natural sorting
		List<Integer> res = al.stream().sorted().collect(Collectors.toList());
		System.out.println(res);

		// sorting done based on customized sorting using Comparator
		List<Integer> res1 = al.stream().sorted((i1, i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(res1);
	}
}
