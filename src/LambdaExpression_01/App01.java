package LambdaExpression_01;

// without lambda , here we required implementation class
/*
interface interf {
	public void m1();
}

public class App01 implements interf {
	public void m1() {
		System.out.println("m1 implemented...");
	}

	public static void main(String[] args) {
		interf i = new App01();
		i.m1();
	}
}
*/

// with lamda expression , here we don't require implementation class
interface interf {
	public void m1();
}

public class App01 {
	public static void main(String[] args) {
		interf i = () -> System.out.println("m1 implemented using lamda expression...");	
		i.m1();
	}
}