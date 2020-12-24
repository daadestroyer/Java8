package Streams_09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App01_GetOddAndEvenNoInListUsingStream {
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
		for(int i : al1) {
			if(i%2==0) {
				res1.add(i);
			}
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
		
		List<Integer> even = al1.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> odd = al1.stream().filter(i->i%2!=0).collect(Collectors.toList());
	
		System.out.println(even);
		System.out.println(odd);
		
		
	}
}
