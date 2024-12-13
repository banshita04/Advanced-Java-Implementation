package lambdaexpressions.geeksforgeeks;

import java.util.function.Predicate;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> check = num->{
			int squareRoot = (int) Math.sqrt(num);
			return squareRoot*squareRoot==num;
		};
		
		System.out.println("Perfect square: "+check.test(81));
	}

}
