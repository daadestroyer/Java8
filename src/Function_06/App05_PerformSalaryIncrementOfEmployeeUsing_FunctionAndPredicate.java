package Function_06;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Department {
	String name;
	double salary;

	Department(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}
}

public class App05_PerformSalaryIncrementOfEmployeeUsing_FunctionAndPredicate {

	static void addData(ArrayList<Department> al) {
		al.add(new Department("Sakshi", 8000));
		al.add(new Department("Shubham", 9000));
		al.add(new Department("Shubhanshu", 1000));
		al.add(new Department("Yash", 5000));
		al.add(new Department("Kshitij", 4500));
	}

	public static void main(String[] args) {
		ArrayList<Department> al = new ArrayList<Department>();
		Predicate<Department> p = d -> d.salary < 5500;

		Function<Department, Department> f = emp -> {
			emp.salary += 500;
			return emp;
		};
		
		addData(al);

		System.out.println("******* Before Increment *******");
		for (Department dep : al) {
			System.out.println("name = " + dep.name);
			System.out.println("salary = " + dep.salary);
			System.out.println();
		}

		System.out.println("******* Before Increment *******");
		for (Department dep : al) {
			if(p.test(dep)) {
				f.apply(dep);
				System.out.println("name = " + dep.name);
				System.out.println("salary = " + dep.salary);
				System.out.println();
			}
		}
	}
}
