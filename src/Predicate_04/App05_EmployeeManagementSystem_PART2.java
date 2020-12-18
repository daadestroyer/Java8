package Predicate_04;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employe {
	String name;
	String profile;
	double salary;
	String city;

	Employe(String name, String profile, double salary, String city) {
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

public class App05_EmployeeManagementSystem_PART2 {
	static void display(Predicate<Employe> p1, ArrayList<Employe> list) {
		for (Employe employe : list) {
			if (p1.test(employe)) {
				System.out.println(employe.name);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employe> list = new ArrayList<Employe>();

		// Predicate to print those employee whose profile is SDE
		Predicate<Employe> p1 = emp -> emp.profile.equals("SDE");

		// Predicate to print those employee who belong to bengaluru city
		Predicate<Employe> p2 = emp -> emp.city.equals("Bengaluru");

		// Predicate to print those employee whose salary is less than 70000
		Predicate<Employe> p3 = emp -> emp.salary > 70000;

		list.add(new Employe("Sakshi", "SDE", 100000, "Bengaluru"));
		list.add(new Employe("Shubham", "SDE", 100000, "Bengaluru"));
		list.add(new Employe("Shubhanshu", "SDE", 100000, "Bengaluru"));
		list.add(new Employe("Kshitij", "Tester", 60000, "Hyderabad"));
		list.add(new Employe("Yash", "Analyst", 50000, "Bengaluru"));
		list.add(new Employe("Satbeer", "Manager", 100000, "Hyderabad"));

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
		System.out.println("************************");
		System.out.println("Predicate to print those employee whose profile is SDE and belong to bengaluru city");
		display(p1.and(p2), list);
		System.out.println("************************");
		System.out.println("Predicate to print those employee whose salary is grater than 50000 or belong to bengaluru city");
		display(p2.or(p3), list);
	}
}
