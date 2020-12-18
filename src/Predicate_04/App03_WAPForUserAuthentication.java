package Predicate_04;

import java.util.Scanner;
import java.util.function.Predicate;

class User {
	String username;
	String userpassword;

	User(String uname, String upwd) {
		this.username = uname;
		this.userpassword = upwd;
	}

}

public class App03_WAPForUserAuthentication {
	public static void main(String[] args) {
		Predicate<User> p = user -> user.username.equals("shubham") && user.userpassword.equals("java");

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter username : ");
		String name = scanner.next();
		System.out.print("Enter username : ");
		String password = scanner.next();
		User user = new User(name, password);

		if (p.test(user)) {
			System.out.println("Login Successfull Welcome " + user.username);
		} else {
			System.out.println("Access Denied !");
		}
	}
}
