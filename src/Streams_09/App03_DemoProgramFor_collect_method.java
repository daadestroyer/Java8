package Streams_09;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App03_DemoProgramFor_collect_method {
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("sakshi");
		al.add("shubham");
		al.add("shubhanshu");

		List<String> res = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(res);
	}
}
