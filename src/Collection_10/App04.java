package Collection_10;

import java.util.ArrayList;
import java.util.Collections;

class Employee {
	int eno;
	String ename;

	Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public String toString() {
		return eno + ":" + ename;
	}
}

public class App04 {
	public static void main(String[] args) {

		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(new Employee(104, "Shubham"));
		al1.add(new Employee(102, "Shubhanshu"));
		al1.add(new Employee(101, "Sakshi"));
		al1.add(new Employee(109, "Krishna"));
		System.out.println(al1);
		Collections.sort(al1, (e1, e2) -> (e1.eno > e2.eno) ? 1 : (e1.eno < e2.eno) ? -1 : 0);
		System.out.println("\n"+al1);

	}
}
