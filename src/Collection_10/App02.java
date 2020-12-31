package Collection_10;

import java.util.Collections;
import java.util.TreeSet;

/*
>>> TreeSet is a Set implementation class 
>>> TreeSet add element using natural sorting order
>>> We can also use TreeSet with customized natural sorting

*/
public class App02 {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(2);
		ts.add(30);
		ts.add(4);
		ts.add(50);
		ts.add(6);
		System.out.println("Natural Sorting");
		System.out.println(ts);

		System.out.println("\nCustomized Sorting");
		TreeSet<Integer> ts1 = new TreeSet<Integer>((i1,i2) -> (i1>i2) ? -1 : (i1<i2) ? 1 : 0 );	
		ts1.add(10);
		ts1.add(2);
		ts1.add(30);
		ts1.add(4);
		ts1.add(50);
		ts1.add(6);
		System.out.println(ts1);
	}
}
