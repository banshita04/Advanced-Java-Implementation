package lambdaexpressions.geeksforgeeks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> stringList = List.of("Hello","Mars","Earth","Chocolate","Alien","Zebra");
		System.out.println(
				stringList
				.stream()
				.sorted()
				.collect(Collectors.toList()));
		
		List<String> list = new ArrayList<>(stringList);
		
		list.sort((s1,s2)->s1.compareToIgnoreCase(s2));
		
		System.out.println(list);
	}

}
