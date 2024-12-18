package lambdaexpressions.geeksforgeeks;

import java.util.function.Function;

public class Factorial {
	public static void main(String[] args) {
		int n = 5;

		Function<Integer, Integer> factorial = num->{
			int fact = 1;
			for(int i = 1; i <= num; i++) {
				fact*=i;
			}
			return fact;
		};
		
		System.out.println(factorial.apply(n));
	}
}
