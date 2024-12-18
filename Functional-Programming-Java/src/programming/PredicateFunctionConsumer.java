package programming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateFunctionConsumer {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,3,1,4,7,3,7,9);

		Predicate<Integer> isEvenPredicate = n->n%2==0;
		
		//WORKING OF PREDICATE
		Predicate<Integer> isEvenPredicate1 = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer num) {
				// TODO Auto-generated method stub
				return num%2==0;
			}
		};
		
		Function<Integer, Integer> squareFunction = a->a*a;
		
		//WORKING OF FUNCTION
		Function<Integer, Integer> squareFunction1 = new Function<Integer, Integer>() {
			
			@Override
			public Integer apply(Integer num) {
				// TODO Auto-generated method stub
				return num*num;
			}
		};
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		//WORKING OF CONSUMER
		Consumer<Integer> sysoutConsumer1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer num) {
				// TODO Auto-generated method stub
				System.out.println(num);
			}
		};

		numbers.stream().
		filter(isEvenPredicate).
		map(squareFunction).
		forEach(sysoutConsumer);
	}

}
