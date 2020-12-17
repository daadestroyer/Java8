package DefaultMethods_02;

interface Left1 {
	default void m1() {
		System.out.println("m1 of Left");
	}
}

interface Right1 {
	default void m1() {
		System.out.println("m1 of Right");
	}
}

public class App02_MultipleInheritance_Failure implements Left1, Right1 {

	public void m1() {
		System.out.println("My own implementation"); // Our own implementation
		Left1.super.m1(); // Using m1 of Left implementation
		Right1.super.m1(); // using m1 of Right implementation
	}

	public static void main(String[] args) {
		App02_MultipleInheritance_Failure app2 = new App02_MultipleInheritance_Failure();
		app2.m1();
	}

}
