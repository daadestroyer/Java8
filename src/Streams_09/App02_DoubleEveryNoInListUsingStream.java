package Streams_09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App02_DoubleEveryNoInListUsingStream {
	public static void main(String[] args) {
		/*
		// without using Stream
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(0);
		al1.add(10);
		al1.add(20);
		al1.add(5);
		al1.add(15);
		al1.add(25);

		ArrayList<Integer> res1 = new ArrayList<Integer>();
		for (int i : al1) {
			res1.add(i*2);
		}
		System.out.println(res1);
		*/
		
		// with stream
		List<Integer> al1 = new ArrayList<Integer>();
		al1.add(0);
		al1.add(10);
		al1.add(20);
		al1.add(5);
		al1.add(15);
		al1.add(25);
		
		List<Integer> res1 = al1.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(res1);
	}
}
