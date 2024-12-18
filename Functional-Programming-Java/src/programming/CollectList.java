package programming;

import java.util.List;
import java.util.stream.Collectors;

public class CollectList {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> doubleNumbers = doubleList(numbers);
		System.out.println("Numbers Square: "+doubleNumbers);
		
		List<Integer> evenNumbers = evenList(numbers);
		System.out.println("Even numbers: "+evenNumbers);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", 
				"PCF", "Azure", "Docker", "Kubernetes");		
		List<Integer> stringLength = lengthList(courses);
		System.out.println("Length of courses: "+stringLength);

	}

	private static List<Integer> lengthList(List<String> courses) {
		// TODO Auto-generated method stub
		return courses.stream().
				map(x-> x.length()).
				collect(Collectors.toList());
	}

	private static List<Integer> evenList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().
				filter(n->n%2==0).
				collect(Collectors.toList());
	}

	private static List<Integer> doubleList(List<Integer> numbers) {
		// TODO Auto-generated method stub
		return numbers.stream().
				map(num -> num*num).
				collect(Collectors.toList());
	}

}
