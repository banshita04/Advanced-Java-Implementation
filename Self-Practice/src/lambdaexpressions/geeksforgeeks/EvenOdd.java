package lambdaexpressions.geeksforgeeks;

import java.util.List;
import java.util.stream.Collectors;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);

		System.out.println("Original list: "+
				integerList
				.stream()
		.collect(Collectors.toList()));


		System.out.println("Even numbers: "+
				integerList
				.stream()
		.filter(num->num%2==0)
		.collect(Collectors.toList()));

		System.out.println("Odd numbers: "+
				integerList
				.stream()
		.filter(num->num%2!=0)
		.collect(Collectors.toList()));
	}

}
