package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,1);
		
		integerList.stream().distinct().forEach(System.out::println);
	}
}