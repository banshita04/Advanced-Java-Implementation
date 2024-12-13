package lambdaexpressions.geeksforgeeks;

public class SumOfTwo {

	public static void main(String[] args) {
		int a = 9;
		int b = 6;
		
		SumCalculator sumCalculator = (x,y)->x+y;
		
		System.out.println(sumCalculator.sum(a, b));
	}

}
