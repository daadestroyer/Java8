package LambdaExpression_01;

/*
// without lamda expression
class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread...");
		}
	}
}

public class App04_LamdaExpressionInMultithreading {
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread...");
		}
	}
}
*/
public class App04_LamdaExpressionInMultithreading {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread using Lamda Expression");
			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread using Lamda Expression");
		}
	}
}