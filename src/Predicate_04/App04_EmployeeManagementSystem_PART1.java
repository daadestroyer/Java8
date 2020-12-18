package Predicate_04;

import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

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

	static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee employee : list) {
			if (p.test(employee)) {
				System.out.println(employee.name);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();

		// Predicate to print those employee whose profile is SDE
		Predicate<Employee> p1 = emp -> emp.profile.equals("SDE");

		// Predicate to print those employee who belong to bengaluru city
		Predicate<Employee> p2 = emp -> emp.city.equals("Bengaluru");

		// Predicate to print those employee whose salary is less than 70000
		Predicate<Employee> p3 = emp -> emp.salary > 70000;

		list.add(new Employee("Sakshi", "SDE", 100000, "Bengaluru"));
		list.add(new Employee("Shubham", "SDE", 100000, "Bengaluru"));
		list.add(new Employee("Shubhanshu", "SDE", 100000, "Bengaluru"));
		list.add(new Employee("Kshitij", "Tester", 60000, "Hyderabad"));
		list.add(new Employee("Yash", "Analyst", 50000, "Bengaluru"));
		list.add(new Employee("Satbeer", "Manager", 100000, "Hyderabad"));

		System.out.println("Predicate to print those employee whose profile is SDE");
		display(p1, list);
		System.out.println("************************");
		System.out.println("Predicate to print those employee who belong to bengaluru city");
		display(p2, list);
		System.out.println("************************");
		System.out.println("Predicate to print those employee whose salary is greater than 70000");
		display(p3, list);
		System.out.println("************************");
		System.out.println("Predicate to print those employee whose salary is less than 70000");
		display(p3.negate(), list);
	}
}
