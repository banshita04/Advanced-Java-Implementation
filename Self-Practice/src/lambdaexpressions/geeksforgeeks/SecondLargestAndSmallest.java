package lambdaexpressions.geeksforgeeks;

import java.util.List;
import java.util.stream.Collectors;

public class SecondLargestAndSmallest {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(2,13,4,2,11,56,31,12,44,90);
		
		List<Integer> sortedDistinct = integerList
				.stream()
				.sorted()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Second Smallest: "+sortedDistinct.get(1));
		System.out.println("Second Largest: "+sortedDistinct.get(sortedDistinct.size()-2));
	}
}
