package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
	
	Calc2 calc2 = (n1,n2) -> n1 / (double)n2;

	System.out.println(calc2.divide(10,3));
	}
}
