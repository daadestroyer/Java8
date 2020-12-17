package StaticMethods_03;

interface Interf {
	static void m1() {
		System.out.println("Interface Static method");
	}

	default void m2() {
		System.out.println("Interface Default Method");
	}
}

public class App01_StaticMethodsDemo implements Interf {
	public static void main(String[] args) {
		Interf.m1(); // we can call interface static method by interface name only

	}
}
