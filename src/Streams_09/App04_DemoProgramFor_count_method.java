package Streams_09;

import java.util.ArrayList;
import java.util.List;

public class App04_DemoProgramFor_count_method {
	public static void main(String[] args) {
		List<String> aList = new ArrayList<String>();
		aList.add("shubham");
		aList.add("sakshi");
		aList.add("shubhanshu");
		aList.add("raj");
		aList.add("veer");

		long x = aList.stream().filter(s->s.length()<5).count();
		System.out.println(x);
	}
}
