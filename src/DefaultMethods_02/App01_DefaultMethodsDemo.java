package DefaultMethods_02;

interface Left {
	default void m1() {
		System.out.println("m1 default method");
	}
}

public class App01_DefaultMethodsDemo implements Left {
	public static void main(String[] args) {
		App01_DefaultMethodsDemo app01 = new App01_DefaultMethodsDemo();
		app01.m1();
	}
}
