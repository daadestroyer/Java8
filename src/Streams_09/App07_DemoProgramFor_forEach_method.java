package Streams_09;

import java.util.ArrayList;

public class App07_DemoProgramFor_forEach_method {
	public static void main(String[] args) {

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("sakshi");

		aList.forEach(s -> System.out.println(s));
		System.out.println();
		aList.forEach(System.out :: println);
	}
}
	