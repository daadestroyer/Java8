package Predicate_04;

import java.util.ArrayList;
import java.util.Scanner;

class Employee {
	String name;
	String profile;
	double salary;
	String city;

	Employee(String name, String profile, double salary, String city) {
		this.name = name;
		this.profile = profile;
		this.salary = salary;
		this.city = city;
	}

	public String toString() {
		String s = String.format("%s,%s,%.2f,%s", name, profile, salary, city);
		return s;
	}

}

public class App04_EmployeeManagementSystem_PART1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter no of employee you want to add :");
		int t = scanner.nextInt();
		while (t-- > 0) {

			System.out.print("Enter employee name : ");
			String name = scanner.next();

			System.out.print("Enter employee profile : ");
			String profile = scanner.next();

			System.out.print("Enter employee salary : ");
			double salary = scanner.nextDouble();

			System.out.print("Enter employee city :");
			String city = scanner.next();

			Employee employee = new Employee(name, profile, salary, city);
			ArrayList<Employee> e1 = new ArrayList<Employee>();
			e1.add(employee);

			System.out.println(e1);
		}
	}
}