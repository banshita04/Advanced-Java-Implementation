package lambdaexpressions.geeksforgeeks;

import java.util.function.BiFunction;

public class SumOfAllPrimes {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> sumOfAllPrimes
		= (lower, upper) ->
		{
			int sum = 0;
			for(int i = lower; i <= upper; i++) {
				int count = 0;
				for(int j = 1; j <= i; j++) {
					if(i%j == 0) {
						count++;
					}
				}
				if(count==2) {
					sum+=i;
				}
			}
			return sum;
		};
		
		System.out.println("Sum of primes: "+sumOfAllPrimes.apply(1, 10));
	}
}
