package Collection_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
>>> Comparator is a interface that contain only one abstract method that is compare() method i,e it is called FunctionalInterface
>>> Comparator is used to define our own sorting which is nothing but a customize sorting

public int compare(Object o1 , Object Object o2){
 // if o1 has to come before o2 then return -1 (-ve value)
 // if o2 has to come after o2 then return 1 (+ve value)
 // if o1 and o2 are equal return 0
}
*/

class MyComparator implements Comparator<Integer> {
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2) {
			return -1;
		} else if (o1 < o2) {
			return +1;
		} else {
			return 0;
		}
		/*
		 * OR return (I1 > I2) ? -1 : (I1 < I2 ) ? +1 : 0;
		 */
	}
}

public class App01_ComparatorInterface {
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(10);
		aList.add(0);
		aList.add(15);
		aList.add(5);
		aList.add(20);
		System.out.println("Before Sorting");
		System.out.println(aList); // 10 0 15 5 20

		System.out.println("\nAfter Ascending Order Sorting");
		Collections.sort(aList);
		System.out.println(aList); // [0, 5, 10, 15, 20]

		// witout using lamda expression
		System.out.println("\nAfter Descending  Order Sorting Without Using Lambda Expression");
		Collections.sort(aList, new MyComparator());
		System.out.println(aList); // [20, 15, 10, 5, 0]

		// with using lambda expression
		System.out.println("\nAfter Descending  Order Sorting With Using Lamda Expression");
		Collections.sort(aList, (I1, I2) -> (I1 > I2) ? -1 : (I1 < I2) ? 1 : 0);
		System.out.println(aList); // [20, 15, 10, 5, 0]

	}
}
