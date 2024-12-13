package lambdaexpressions.geeksforgeeks;

import java.util.function.BiFunction;

public class Concatenate {
	public static void main(String[] args) {
		BiFunction<String, String, String> concatenate = (s1,s2)->{
			String concatenatedString = s1.concat(s2);
			return concatenatedString;
		};
		
		System.out.println(concatenate.apply("hello", "mars"));
	}
}
