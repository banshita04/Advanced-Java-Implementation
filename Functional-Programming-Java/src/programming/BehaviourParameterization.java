package programming;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehaviourParameterization {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		filterAndPrint(numbers, n->n%2==0);
		
		filterAndPrint(numbers, n->n%2!=0);

		List<Integer> squaredNumbers = mapAndCreateNewList(numbers, n->n*n);
		System.out.println("squaredNumbers: "+squaredNumbers);
		
		List<Integer> cubedNumbers = mapAndCreateNewList(numbers, n->n*n*n);
		System.out.println("cubedNumbers: "+cubedNumbers);
		
		List<Integer> doubledNumbers = mapAndCreateNewList(numbers, n->n+n	);
		System.out.println("doubledNumbers: "+doubledNumbers);

	}

	private static List<Integer> mapAndCreateNewList(List<Integer> numbers,
			Function<Integer, Integer> mappingFunction) {
		
		return numbers.stream().
				map(mappingFunction).
				collect(Collectors.toList());
	}

	private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
		numbers
		.stream()
		.filter(predicate)
		.forEach(System.out.append("**Required numbers**\n")::println);
	}
}
