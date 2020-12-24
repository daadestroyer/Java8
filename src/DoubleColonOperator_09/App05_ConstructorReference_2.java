package DoubleColonOperator_09;

class Demo {
	public Demo() {
		System.out.println("Demo constructor creating object");
	}
}

interface Right {
	public Demo object();
}

public class App05_ConstructorReference_2 {
	public static void main(String[] args) {
		Right right = Demo::new;
	
		Demo demo = right.object();
		System.out.println(demo);
	}
}
