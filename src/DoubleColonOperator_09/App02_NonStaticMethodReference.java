package DoubleColonOperator_09;

interface Interf {
	public void m1();
}

public class App02_NonStaticMethodReference {
	public void m2() {
		System.out.println("m2 implemented m1 using instance method");
	}

	public static void main(String[] args) {
		App02_NonStaticMethodReference app02 = new App02_NonStaticMethodReference();
		Interf i =  app02::m2;
		i.m1();

	}
}
