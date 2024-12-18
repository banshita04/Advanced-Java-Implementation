package programming;

import java.util.Comparator;
import java.util.List;

public class DistinctAndSorted {

	public static void main(String[] args) {

		List<Integer> list = List.of(2,42,5,11,3,5,98,55,32,1,3);
		
		list.stream().
		distinct().
		forEach(System.out.append("**Distinct elements**\n")::println);
		
		list.stream().
		sorted().
		forEach(System.out.append("**Sorted elements**\n")::println);
		
		list.stream().
		distinct().
		sorted().
		forEach(System.out.append("**Distinct and sorted elements**\n")::println);
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", 
				"PCF", "Azure", "Docker", "Kubernetes");		
		courses.stream().
		sorted(Comparator.naturalOrder()).//default
		forEach(System.out.append("**Sorted String List**\n")::println);
		
		courses.stream().
		sorted(Comparator.reverseOrder()).
		forEach(System.out.append("**Reverse sorted String List**\n")::println);
		
		courses.stream().
		sorted(Comparator.comparing(str -> str.length())).
		forEach(System.out.append("**Order of length sorted String List**\n")::println);




	}

}
