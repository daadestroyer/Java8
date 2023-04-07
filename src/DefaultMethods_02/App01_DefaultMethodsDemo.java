package DefaultMethods_02;

/*
1. if a new method added in interface before java 7 all classes forcefully need to implement that method, to overcome
   this issue in java8 default method is introduced which has body

2. we can use default method in child classes , means default method support inheritance
 */
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
