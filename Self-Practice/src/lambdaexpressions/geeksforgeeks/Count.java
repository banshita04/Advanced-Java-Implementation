package lambdaexpressions.geeksforgeeks;

import java.util.function.Function;

public class Count {
	public static void main(String[] args) {
		String str = "banshita";
		
		Function<String, Integer> count = s -> s.length();
		
		System.out.println(count.apply(str));
	}
}
