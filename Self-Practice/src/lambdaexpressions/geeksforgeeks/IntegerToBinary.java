package lambdaexpressions.geeksforgeeks;

import java.util.function.Function;

public class IntegerToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, String> decimalToBinary = num -> {
			return Integer.toBinaryString(num);
		};
		
		System.out.println(decimalToBinary.apply(99));
	}

}
