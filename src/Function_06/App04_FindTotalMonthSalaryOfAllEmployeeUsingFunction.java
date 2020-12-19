package Function_06;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {

	String name;
	double salary;

	Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String toString() {
		return name + ":" + salary;
	}
}

public class App04_FindTotalMonthSalaryOfAllEmployeeUsingFunction {

	static void addEmployee(ArrayList<Employee> al) {
		al.add(new Employee("Sakshi", 80000));
		al.add(new Employee("Shubham", 90000));
		al.add(new Employee("Shubhanshu", 100000));
		al.add(new Employee("Yash", 50000));
		al.add(new Employee("Kshitij", 45000));
	}

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		addEmployee(al);

		Function<ArrayList<Employee>, Double> F = f -> {
			double total = 0;
			for (Employee e : f) {
				total += e.salary;
			}
			return total;
		};
		
		System.out.println("The total saray of this month : "+F.apply(al));
	}
}
