package LambdaExpression;

interface I1 {
	public void length(String s);
}
interface I2 {
	public void square(int a , int b);
}

public class App03 {
	public static void main(String[] args) {
		I1 i1 = (s) -> System.out.println("Length is : "+s.length());
		i1.length("shubham");
		
		I2 i2 = (a,b)->System.out.println("Square is : "+a*b);
		i2.square(2,3);
	}
}
