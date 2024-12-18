package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class LongestAndSmallestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> stringList = List.of("bob the builder","oswald","noddy","pingu","thomas");

		int maxString = stringList
				.stream()
				.map(str->str.length())
				.max(Integer::compare)
				.get();

		int minString = stringList
				.stream()
				.map(str->str.length())
				.min(Integer::compare)
				.get();

		System.out.println("maxString: "+maxString);
		System.out.println("minString: "+minString);
	}

}
