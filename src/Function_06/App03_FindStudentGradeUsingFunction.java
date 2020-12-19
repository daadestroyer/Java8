package Function_06;

import java.util.ArrayList;
 
import java.util.function.Function;

class Student {

	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
}

public class App03_FindStudentGradeUsingFunction {

	static void addStudent(ArrayList<Student> addStudent) {
		addStudent.add(new Student("Sakshi", 70));
		addStudent.add(new Student("Shubham", 80));
		addStudent.add(new Student("Shubhanshu", 75));
		addStudent.add(new Student("Yash", 50));
		addStudent.add(new Student("Kshitij", 55));

	}

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();
		addStudent(al);

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80)
				return "A[Dictinction]";
			else if (marks >= 60)
				return "B[First Class]";
			else if (marks >= 50)
				return "C[Second Class]";
			else
				return "D[Third Class]";
		};

		for (Student s : al) {
			System.out.println("Name : "+s.name);
			System.out.println("Grade : "+f.apply(s));
			System.out.println();
		}
	}
}
