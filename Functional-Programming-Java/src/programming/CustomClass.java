package programming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

class Course{
	private String name;
	private String category;
	private int score;
	private int noOfStudents;
	public Course(String name, String category, int score, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.score = score;
		this.noOfStudents = noOfStudents;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return name + ":" + noOfStudents + ":" + score;
	}

}
public class CustomClass {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Course> courses = 
				List.of(
						new Course("Spring", "Framework", 98, 20000),
						new Course("Spring Boot", "Framework", 95, 30000),
						new Course("API", "Microservices", 97, 10000),
						new Course("Microservices", "Microservices", 92, 23000),
						new Course("Full Stack", "Full Stack", 99, 20600),
						new Course("AWS", "Cloud", 95, 29000),
						new Course("Azure", "Cloud", 91, 21000),
						new Course("Docker", "Cloud", 97, 40000),
						new Course("Kubernetes", "Cloud", 95, 10000)
						);


		Predicate<Course> reviewScoreGreaterThan95Predicate = course->course.getScore()>95;
		Predicate<Course> reviewScoreGreaterThan90Predicate = course->course.getScore()>90;
		Predicate<Course> reviewScoreLessThan90Predicate = course->course.getScore()<90;

		System.out.println("allMatch: "
				+courses.stream().allMatch(reviewScoreGreaterThan95Predicate));
		System.out.println("noneMatch: "
				+courses.stream().noneMatch(reviewScoreGreaterThan95Predicate));
		System.out.println("noneMatch: "
				+courses.stream().noneMatch(reviewScoreLessThan90Predicate));
		System.out.println("anyMatch: "
				+courses.stream().anyMatch(reviewScoreLessThan90Predicate));
		System.out.println("anyMatch: "
				+courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));



		Comparator<Course> sortingByNoOfStudentsIncreasing 
		= Comparator.comparingInt(Course::getNoOfStudents);

		System.out.println("Increasing order: "+
				courses
				.stream()
		.sorted(sortingByNoOfStudentsIncreasing)
		.collect(Collectors.toList()));

		Comparator<Course> sortingByNoOfStudentsDecreasing 
		= Comparator.comparingInt(Course::getNoOfStudents).reversed();

		System.out.println("Decreasing order: "+
				courses
				.stream()
		.sorted(sortingByNoOfStudentsDecreasing)
		.collect(Collectors.toList()));


		Comparator<Course> sortingByNoOfStudentsAndNoOfReviews 
		= Comparator.comparingInt(Course::getNoOfStudents)
		.thenComparingInt(Course::getScore).reversed();

		System.out.println("Order of students and reviews: "+
				courses
				.stream()
		.sorted(sortingByNoOfStudentsAndNoOfReviews)
		.collect(Collectors.toList()));

		System.out.println("**Using limit function**");

		System.out.println(
				courses
				.stream()
				.sorted(sortingByNoOfStudentsAndNoOfReviews)
				.limit(3)
				.collect(Collectors.toList()));

		System.out.println("**Using skip function**");

		System.out.println(
				courses
				.stream()
				.sorted(sortingByNoOfStudentsAndNoOfReviews)
				.skip(5)
				.collect(Collectors.toList()));

		System.out.println("Courses: "+courses);

		System.out.println("**Using takewhile function**");
		System.out.println(
				courses.stream()
				.takeWhile(course -> course.getScore()>95)
				.collect(Collectors.toList())
				);

		System.out.println("**Using dropwhile function**");
		System.out.println(
				courses.stream().sorted(Comparator.comparing(Course::getScore).reversed())
				.dropWhile(reviewScoreGreaterThan95Predicate)
				.collect(Collectors.toList())
				);

		System.out.println("Max sortingByNoOfStudentsAndNoOfReviews: "+
				courses
				.stream()
		.max(sortingByNoOfStudentsAndNoOfReviews)
		.get()//returns last element in the list
				);

		System.out.println("Min sortingByNoOfStudentsAndNoOfReviews: "+
				courses
				.stream()
		.min(sortingByNoOfStudentsAndNoOfReviews)
		.get()//returns first element in the list
				);

		System.out.println("Min sortingByNoOfStudentsAndNoOfReviews: "+
				courses
				.stream()
		.filter(reviewScoreLessThan90Predicate)
		.min(sortingByNoOfStudentsAndNoOfReviews)
		.orElse(null)
				);

		Predicate<Course> reviewScoreLessThan95GreaterThan90Predicate 
		= course->course.getScore()>90 && course.getScore()<95;

		System.out.println("Using findFirst: "+
				courses
				.stream()
		.filter(reviewScoreLessThan95GreaterThan90Predicate)
		.sorted(Comparator.comparing(Course::getNoOfStudents))
		.findFirst().get()	
				);

		System.out.println("Using findAny: "+
				courses
				.stream()
		.filter(reviewScoreGreaterThan90Predicate)
		.findAny().get()	
				);

		System.out.println("Using mapToInt and sum: "+
				courses
				.stream()
		.filter(reviewScoreGreaterThan95Predicate)
		.mapToInt(Course::getNoOfStudents)
		.sum()	
				);

		System.out.println("Using mapToInt and average: "+
				courses
				.stream()
		.filter(reviewScoreGreaterThan90Predicate)
		.mapToInt(Course::getNoOfStudents)
		.average().getAsDouble()	
				);

		System.out.println("Using mapToInt and count: "+
				courses
				.stream()
		.filter(reviewScoreGreaterThan95Predicate)
		.mapToInt(Course::getNoOfStudents).count()	
				);

		System.out.println("Grouping by category: "+
				courses.stream()
		.collect(Collectors.groupingBy(Course::getCategory))
				);

		System.out.println("Grouping by category and counting: "+
				courses.stream()
		.collect(Collectors
				.groupingBy
				(Course::getCategory, Collectors.counting()))
				);

		System.out.println("Grouping by category and counting: "+
				courses.stream()
		.collect(Collectors
				.groupingBy
				(Course::getCategory, Collectors
						.maxBy(Comparator.comparing(Course::getScore))))
				);

		System.out.println("groupingBy and mapping: "+
				courses.stream()
		.collect((Collectors.groupingBy(Course::getCategory, 
				Collectors.mapping(Course::getName, Collectors.toList()))))
				);

		System.out.println("courses.stream(): "+courses.stream());
		System.out.println("Stream.of(courses): "+Stream.of(courses));
		int numberArray[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("Arrays.stream(numberArray): "+Arrays.stream(numberArray));

		System.out.println(
				IntStream
				.iterate(0, e->e+2)
				.limit(10).boxed()
				.collect(Collectors.toList())
				);

		System.out.println("**BigInteger**");
		System.out.println(
				LongStream
				.rangeClosed(1, 50)
				.mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply)
				);

		System.out.println("***Just the names of the courses**");
		System.out.println(
				courses.stream()
				.map(c->c.getName())
				.collect(Collectors.toList())
				);

		System.out.println("Using split method and flatMap: "+
				courses
				.stream()
		.map(course -> course.getName().split(","))
		.flatMap(Arrays::stream)
		.collect(Collectors.toList())
				);

		List<String> cName = courses.stream().map(c->c.getName()).toList();
		List<String> cName2 = cName;


		System.out.println("Course names of same length: "+
				cName
				.stream()
		.flatMap(course->cName2
				.stream()
				.filter(course2->
				course2.length()==course.length())
				.map(course2 -> List.of(course,course2)))
		.filter(list->!list.get(0).equals(list.get(1)))
		.collect(Collectors.toList())
				);

		List<String> modifyableCourses = new ArrayList<>(cName);
		modifyableCourses.replaceAll(str->str.toUpperCase());
		System.out.println("Using replaceAll method: "+modifyableCourses);
		modifyableCourses.removeIf(c->c.length()>5);
		System.out.println("Using removeIf: "+modifyableCourses);

		Predicate<Course> reviewScoreGreaterThan95Predicate2 = 
				createPredicateWithCutOffReviewScore(95);
		Predicate<Course> reviewScoreGreaterThan90Predicate2 = 
				createPredicateWithCutOffReviewScore(90);

	}

	private static Predicate<Course> createPredicateWithCutOffReviewScore
	(int cutOffReviewScore) {
		return course->course.getScore()>cutOffReviewScore;
	}

}
