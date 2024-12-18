package programming;

import java.util.List;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class BinaryOperatorImplementation {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;

		//WORKING OF BINARY OPERATOR
		BinaryOperator<Integer> sumBinaryOperator1 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
		};

		int sum = numbers.stream().filter(n->n%2==0).reduce(0,sumBinaryOperator);
		System.out.println("Sum of squares: "+sum);

		//No input -> Return something
		Supplier<Integer> randomIntegerSupplier = ()->{
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println("randomIntegerSupplier: "+randomIntegerSupplier.get());

		UnaryOperator<Integer> unaryOperator = (x)->3*x;
		System.out.println("unaryOperator: "+unaryOperator.apply(10));
	}
}
