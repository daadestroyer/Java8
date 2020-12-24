package DoubleColonOperator_09;


interface Inter{
	public void m1();
}
public class App01_StaticMethodReference {
	

	public static void m2() {
		System.out.println("m2 implemented m1 using static method reference");
	}
	
	public static void main(String[] args) {
		/*
		 // using lamda expression
			Inter i = ()->{
				System.out.println("m1 implemented");
			};
			i.m1();
			
		*/
		
		// using method reference
		Inter i = App01_StaticMethodReference::m2;
		i.m1();
	
	}
}
