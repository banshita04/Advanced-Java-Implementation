package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Integer> integerList = List.of(2,31,4,12,3,46,1,45,8);
		
		int min = integerList.stream().min(Integer::compare).get();
		
		int max = integerList.stream().max(Integer::compare).get();
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);
	}

}
