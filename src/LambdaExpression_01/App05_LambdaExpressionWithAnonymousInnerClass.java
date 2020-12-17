package LambdaExpression_01;
/*
// Without lambda expression

class MyRun implements Runnable {
	public void run() {
		System.out.println("Run without lambda expression");
	}
}

public class App05_LambdaExpressionWithAnonymousInnerClass {
	public static void main(String[] args) {
		MyRun run = new MyRun();
		Thread t = new Thread(run);
		t.start();
	}
}
*/

// With Lamda Expression

public class App05_LambdaExpressionWithAnonymousInnerClass {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Run with lambda expression");
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}