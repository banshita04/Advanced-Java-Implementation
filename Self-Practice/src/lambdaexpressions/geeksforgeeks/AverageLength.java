package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class AverageLength {
	public static void main(String[] args) {
		List<String> stringList = List.of("bob the builder","oswald","noddy","pingu","thomas");

		Double length = stringList
				.stream()
				.mapToInt(str->str.length())
				.average()
				.getAsDouble();

		System.out.println(length);
	}
}
