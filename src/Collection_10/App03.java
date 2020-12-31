package Collection_10;

import java.util.TreeMap;

public class App03 {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(100, "Shubham");
		tm.put(200, "Shubhanshu");
		tm.put(300, "Sakshi");
		tm.put(400, "Gauri");
		tm.put(500, "Kshitij");
		tm.put(600, "Yash");
		tm.put(700, "Satbeer");
		System.out.println(tm);
		
		TreeMap<Integer, String> tm1 = new TreeMap<Integer, String>((i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0);
		tm1.put(100, "Shubham");
		tm1.put(200, "Shubhanshu");
		tm1.put(300, "Sakshi");
		tm1.put(400, "Gauri");
		tm1.put(500, "Kshitij");
		tm1.put(600, "Yash");
		tm1.put(700, "Satbeer");
		System.out.println("\n"+tm1);
	}
}
