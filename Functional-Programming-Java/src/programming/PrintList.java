package programming;

import java.util.List;

public class PrintList {
	
	public static void main(String[] args) {
		printAllNumbersInList(List.of(12,3,54,65,32,9,7));
		printEvenNumbersInList(List.of(12,3,54,65,32,9,7));
		printOddNumbersInList(List.of(12,3,54,65,32,9,7));
		printSquareOfNumbersInList(List.of(12,3,54,65,32,9,7));
		printCubeOfNumbersInList(List.of(12,3,54,65,32,9,7));
		
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", 
				"PCF", "Azure", "Docker", "Kubernetes");
		
		System.out.println("**Course names**");
		courses.stream().
		forEach(System.out::println);
		
		System.out.println("**Courses that contain the word \"Spring\"**");
		courses.stream().
		filter(course -> course.contains("Spring")).
		forEach(System.out::println);
		
		System.out.println("**Courses whose names have atleast 4 characters**");
		courses.stream().
		filter(course -> course.length()>=4).
		forEach(System.out::println);
		
		System.out.println("**Count of number of characters in each string**");
		courses.stream().
		forEach(n->System.out.println("Length of "+n+" = "+n.length()));
	}
	
	private static void print(int number) {
		System.out.println(number);
	}
	
	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static boolean isOdd(int number) {
		return number%2!=0;
	}
	
	private static void printAllNumbersInList(List<Integer> list) {

		System.out.println("**printAllNumbersInList Using loop**");
		for(int num : list) {
			System.out.println(num);
		}
		
		System.out.println("**printAllNumbersInList Using streams and lambda expression**");
		list.stream().
		forEach(n->System.out.println(n));
		
		System.out.println("**printAllNumbersInList Using method reference**");
		list.stream().
		forEach(PrintList::print);
		
		System.out.println("**printAllNumbersInList Using System.out::println**");
		list.stream().forEach(System.out::println);
	}
	
	private static void printEvenNumbersInList(List<Integer> list) {
		System.out.println("**printEvenNumbersInList Using loop**");
		for(int num : list) {
			if(num%2==0)
			System.out.println(num);
		}
		
		System.out.println("**printEvenNumbersInList Using streams and lambda expression**");
		list.stream().
		filter(n->n%2==0).//lambda expression
		forEach(System.out::println);//method reference
		
		System.out.println("**printEvenNumbersInList Using streams and function**");
		list.stream().
		filter(PrintList::isEven).
		forEach(System.out::println);
	}
	
	private static void printOddNumbersInList(List<Integer> list) {
		System.out.println("**printOddNumbersInList Using loop**");
		for(int num:list) {
			if(num%2!=0)
				System.out.println(num);
		}
		
		System.out.println("**printOddNumbersInList Using streams and function**");
		list.stream().
		filter(PrintList::isOdd).
		forEach(System.out::println);
		
		System.out.println("**printOddNumbersInList Using streams and lambda expression**");
		list.stream().
		filter(num->num%2!=0).
		forEach(System.out::println);
	}
	
	private static void printSquareOfNumbersInList(List<Integer> list) {
		
		System.out.println("**Squares of numbers**");
		list.stream().
		map(sq->sq*sq).
		forEach(System.out::println);
	}
	
	private static void printCubeOfNumbersInList(List<Integer> list) {
		System.out.println("**Cubes of numbers**");
		list.stream().
		map(sq->sq*sq*sq).
		forEach(System.out::println);
	}

	
	
	

}
