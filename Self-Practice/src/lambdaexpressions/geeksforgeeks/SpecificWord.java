package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class SpecificWord {
	public static void main(String[] args) {
		List<String> stringList = List.of("bob the builder","oswald","noddy","pingu","thomas");
		
		String specificString = "bob";
		
		
		boolean check = stringList
				.stream()
				.anyMatch(word -> word.contains(specificString));
		
		System.out.println("Word found: "+check);
		
	}
}
