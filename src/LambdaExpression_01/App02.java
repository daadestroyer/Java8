package LambdaExpression_01;

/*
//without lambda , here we required implementation class
interface inter {
	public void add(int a, int b);
}

public class App02 implements inter {
	public void add(int a, int b) {
		System.out.println("a+b without lambda expression...");
	}

	public static void main(String[] args) {
		App02 app02 = new App02();
		app02.add(1, 1);
	}
}
*/

//with lambda , here we didn't required implementation class
interface inter {
	public void add(int a, int b);
}

public class App02 {
	public static void main(String[] args) {
		inter i = (a, b) -> System.out.println(a + b + " with lamda expression");
		i.add(10, 20);
	}
}