package Streams_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App08_DemoProgramFor_toArray_method {
	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(3);
		al.add(4);
		al.add(6);
		al.add(1);
		al.add(5);
		al.add(8);

		Integer[] ar = al.stream().toArray(Integer[]::new);
		
		System.out.println(Arrays.toString(ar));
	}
}
