package programming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
@SuppressWarnings("unused")
public class Bi_PredicateFunctionConsumer {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(2,3,1,4,7,3,7,9);
		
		//BiPredicate
		BiPredicate<Integer, String> biPredicate = (number,str)->{
			return number>10 && str.length()>5;
		};
		System.out.println(biPredicate.test(15, "pom"));
		
		//BiFuntion
		BiFunction<Integer, String, String> biFunction = (number,str)->{
			return number+str;
		};
		System.out.println(biFunction.apply(15, "pom"));
		
		//BiConsumer
		BiConsumer<Integer, String> biConsumer = (num, str2)->{
			System.out.println(num);
			System.out.println(str2);
		};
		biConsumer.accept(75, "chocolates");
	}

}
