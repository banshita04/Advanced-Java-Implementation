package taskexception;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StudentUserInterface{

	static List<Student> students=new ArrayList<>();
	public static void main(String[] args) throws StudentNotFoundException{
		
		//create 5 or more student objects & store in a collection
		//Make a menu driven application and call all functionalities

		Scanner sc = new Scanner(System.in);
		Student ob1 = new Student(101, "abc", 80.0f, 92.5f, 99.0f);
		Student ob2 = new Student(102, "def", 88.0f, 97.5f, 89.0f);
		Student ob3 = new Student(103, "ghi", 81.0f, 90.5f, 79.0f);
		Student ob4 = new Student(104, "jkl", 85.0f, 72.5f, 91.0f);
		Student ob5 = new Student(105, "mno", 80.5f, 82.5f, 96.0f);

		students.add(ob1);
		students.add(ob2);
		students.add(ob3);
		students.add(ob4);
		students.add(ob5);

		StudentUserInterface pig = new StudentUserInterface();



		while(true) {
			System.out.println("1. Find Topper");
			System.out.println("2. Search by ID");
			System.out.println("3. Find top student");
			System.out.println("4. Find by Total Marks");
			System.out.println("5. Get student name and total marks");
			System.out.println("6. Get student name and average");
			System.out.println("7. Exit");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();

			switch (ch) {
			
			case 1:
				//System.out.println("The topper is "+findTopper());
				Student stu = pig.findTopper();
				System.out.println("The topper is "+ stu.getStudName());
				break;

			case 2:
				System.out.println("Enter student ID");
				int id = sc.nextInt();
				try {
					//when you use orElse(null) instead of get(), you can declare s outside the try and catch block
					//Student s = pig.searchById(id);
					Student s = pig.searchById(id);
					System.out.println(s.getStudName());

				} catch (StudentNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("Student not found");
				}
				break;

			case 3:
				System.out.println("Enter the level");
				int level = sc.nextInt();
				List<Student> ls = pig.findTop(level);
				for(Student st:ls)
					System.out.println("The top "+level+" is "+st.getStudName());
				break;

			case 4:
				System.out.println("Enter total marks");
				float m = sc.nextFloat();
				List <Student> l = pig.findByTotalMarksGreaterThan(m);
				System.out.println("Students who got greater than "+m+" are ");
				for(Student s:l)
					System.out.println(s.getStudName());
				break;

			case 5:
				Map<String, Float> s = pig.getStudentNameAndTotalMark();
				for (Map.Entry<String, Float> en: s.entrySet()) 
					System.out.println(en.getKey()+" -> "+en.getValue());
				break;

			case 6:
				Map<String,Float> maps = pig.getStudentNameAndAverage();
				for(Map.Entry<String, Float> e: maps.entrySet())
					System.out.println(e.getKey()+" -> "+e.getValue()/3);
				break;

			case 7:
				System.out.println("Thank you for using the application");
				break;

			default:
				System.out.println("Wrong choice. Try again...");


			}
			if(ch == 7)
				break;

		}

	}
	
	Student findTopper(){
		//Student s=students.stream().max((s1,s2)->s1.getTotalMarks()>s2.getTotalMarks()?1:-1).get();
		Student s=students.stream().
				max((s1, s2)->Float.compare(s1.getTotalMarks(), s2.getTotalMarks())).get();
		return s;
	}
	
	Student searchById(int studId) throws StudentNotFoundException{
		//use stream api if student not found throw StudentNotFoundException

		Student s= students.stream().filter(s1->s1.getStudId()==studId).findFirst().orElse(null);
		if(!(s==null))
			return s;
		else
			throw new StudentNotFoundException("");
	}
	
	List<Student> findTop(int topLevel){
		List <Student> list = students.stream()
				.sorted((s1,s2)->s1.getTotalMarks()>s2.getTotalMarks()?1:-1)
				.limit(topLevel).collect(Collectors.toList());
		return list;
	}
	
	List<Student> findByTotalMarksGreaterThan(float totalMarks){
		List <Student>ls = students.stream().filter(s1->s1.getTotalMarks()>totalMarks)
				.collect(Collectors.toList());

		return ls;
	}
	
	Map<String,Float> getStudentNameAndTotalMark(){
		Map<String,Float> map = students.stream()
				.collect(Collectors.toMap(Student::getStudName,Student::getTotalMarks));
		return map;
	}
	
	Map<String,Float> getStudentNameAndAverage(){
		Map<String, Float> m = students.stream()
				.collect(Collectors.toMap(Student::getStudName, Student::getTotalMarks));
		return m;
	}
	
}
