package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = List.of(
				new Student(1, "Alice", "A", 90),
				new Student(2, "Bob", "B", 70),
				new Student(3, "Charlie", "A", 85),
				new Student(4, "David", "B", 60),
				new Student(5, "Eve", "A", 95),
				new Student(6, "Frank", "C", 80),
				new Student(7, "Grace", "C", 85)
				);
		Map<String, List<String>> studentMap = getTopStudentsByGrade(studentList);
		for(Map.Entry<String, List<String>> entry : studentMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}
	public static Map<String, List<String>> getTopStudentsByGrade(List<Student> studentList){
		
		return
				studentList.stream()
				.filter(student->student.getScore()>75)
				.collect(Collectors.groupingBy(Student::getGrade, 
						Collectors.collectingAndThen(Collectors.toList(), list->list.stream()
								.sorted((s1,s2)->Integer.compare(s2.getScore(), s2.getScore()))
								.map(Student::getStudentName)
								.collect(Collectors.toList()))));


	}

}
