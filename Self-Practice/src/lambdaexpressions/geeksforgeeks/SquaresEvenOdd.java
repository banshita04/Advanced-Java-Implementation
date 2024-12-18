package lambdaexpressions.geeksforgeeks;

import java.util.List;
import java.util.function.Function;

public class SquaresEvenOdd {
	public static void main(String[] args) {
		
		List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
		
		Function<List<Integer>, Integer> sumOfEvenSquares = evenList -> {
			int sumOfEven = 0;
			for (Integer element : integerList) {
				if(element%2==0) {
					sumOfEven+= element*element;
				}
			}
			return sumOfEven;
		};
		
		Function<List<Integer>, Integer> sumOfOddSquares = evenList -> {
			int sumOfOdd = 0;
			for (Integer element : integerList) {
				if(element%2!=0) {
					sumOfOdd+= element*element;
				}
			}
			return sumOfOdd;
		};
		
		System.out.println("sumOfEvenSquares: "+sumOfEvenSquares.apply(integerList));
		System.out.println("sumOfOddSquares: "+sumOfOddSquares.apply(integerList));
		
	}
}
