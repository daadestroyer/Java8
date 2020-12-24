package DoubleColonOperator_09;

public class App03_ImplementRunnableUsingNonStaticMethodReference {

	public void myRun() {
		System.out.println("Implement run method of Runnable interface using non-static method reference");
	}

	public static void main(String[] args) {
		App03_ImplementRunnableUsingNonStaticMethodReference a = new App03_ImplementRunnableUsingNonStaticMethodReference();

		Runnable r = a::myRun;
		Thread thread = new Thread(r);
		thread.start();
		// Internally run method refer myRun method
	}
}
