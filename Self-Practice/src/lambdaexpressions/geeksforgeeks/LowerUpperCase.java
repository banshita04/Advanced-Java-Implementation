package lambdaexpressions.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LowerUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, String> lowerCase = str->str.toLowerCase();

		Function<String, String> upperCase = str->str.toUpperCase();

		String str = "Banshita";

		System.out.println("String in lower case: "+lowerCase.apply(str));
		System.out.println("String in upper case: "+upperCase.apply(str));

		List<String> list = List.of("hello","world","Mars","Pluto","Hey","straWBerry");

		list
		.stream()
		.map(string->string
				.toLowerCase())
		.forEach(System.out::println);
		
		list
		.stream()
		.map(string->string
				.toUpperCase())
		.forEach(System.out::println);
		
		List<String> stringList = new ArrayList<>(list);
		
		stringList.replaceAll(string->string.toLowerCase());
		stringList.forEach(System.out::println);
		
		stringList.replaceAll(string->string.toUpperCase());
		stringList.forEach(System.out::println);
	}

}
