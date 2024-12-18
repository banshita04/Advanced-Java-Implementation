package lambdaexpressions.geeksforgeeks;

import java.util.List;
import java.util.function.Function;

public class MultiplySum {
	public static void main(String[] args) {
		
		List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
		
		Function<List<Integer>, Integer> addition = a -> {
			int sum = 0;
			for (Integer num : a) {
				sum+=num;
			}
			return sum;
		};
		
		System.out.println("Sum: "+addition.apply(integerList));
		
		Function<List<Integer>, Integer> multiplication = a -> {
			int product = 1;
			for (Integer num : a) {
				product*=num;
			}
			return product;
		};
		
		System.out.println("Sum: "+multiplication.apply(integerList));
		
		
	}
}
