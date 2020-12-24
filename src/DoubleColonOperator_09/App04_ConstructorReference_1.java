package DoubleColonOperator_09;

class Sample {
	public Sample() {
		System.out.println("Sample Constructor creating Object");
	}
}

interface Left{
	public Sample object();
}
public class App04_ConstructorReference_1 {
	public static void main(String[] args) {
			Left left = ()->{
			 Sample sample = new Sample();
			 return sample;
			};
			
			Sample s1 = left.object();
			System.out.println(s1);
	}
}
