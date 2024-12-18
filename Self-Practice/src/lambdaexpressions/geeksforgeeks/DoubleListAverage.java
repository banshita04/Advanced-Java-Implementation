package lambdaexpressions.geeksforgeeks;

import java.util.List;

public class DoubleListAverage {
	public static void main(String[] args) {

		List<Double> doubleList = List.of(2.4,2.1,8.9,5.3,1.2,9.0);

		double avg =
				doubleList
				.stream()
				.mapToDouble(Double::doubleValue)
				.average()
				.getAsDouble();

		System.out.println(avg);
	}
}
