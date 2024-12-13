package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class StudentUserInterface{
	static List<Student> students=new ArrayList<>();
	public static void main(String[] args){
		//create 5 or more student objects & store in a collection
		Student s1=new Student(1,"A",60,70,58);
		Student s2=new Student(2,"B",56,56,56);
		Student s3=new Student(3,"C",67,67,45);
		Student s4=new Student(4,"D",78,46,67);
		Student s5=new Student(5,"E",78,78,98);
		StudentUserInterface s=new StudentUserInterface();
		students.add(s1);	 students.add(s2);	 students.add(s3);	 students.add(s4);
		students.add(s5);
		//Make a menu driven application and call all functionalities
	}
	int getNoOfStudentsHavingAverageMoreThan(float avg) {
		int c=(int) students.stream().filter(s->(s.getTotalMarks()/3)>=avg).count();
		return c;
	}
	List<Double> findSumOfM1AndM2OfEachStudent() {
		List<Double> res1=new ArrayList<>();
		//students.stream().mapToDouble(m->m.getM1()+m.getM2()).forEach(s->res1.add((float)s));
		//OR
		res1=students.stream().mapToDouble(m->m.getM1()+m.getM2())
				.boxed().collect(Collectors.toList());
		return res1;
	}
	List<String> getAllStudentNamesSorted(){
		List<String> res=students.stream().
				sorted((s1,s2)->s1.getStudName().compareTo(s2.getStudName())).
				map(s->s.getStudName()).collect(Collectors.toList());
		return res;
	}
	Student findTopper(){
		Student s = students.stream().max((s1,s2)->s1.getTotalMarks()<s2.getTotalMarks()? -1:1).get();
		return s;
	}
	Student searchById(int studId) throws StudentNotFoundException{
		//use stream api if student not found throw StudentNotFoundException
		Optional<Student> s = students.stream().filter(p->p.getStudId()==studId).findFirst();
		if(s.isPresent())
			return s.get();
		else
			throw new StudentNotFoundException();
	}
	List<Student> findTop(int topLevel){
		List<Student> l = students.stream().
				sorted((s1,s2)->s1.getTotalMarks()>s2.getTotalMarks()? -1:1)
				.limit(topLevel).collect(Collectors.toList());
		return l;
	}
	List<Student> findByTotalMarksGreaterThan(float totalMarks){
		List<Student> l = students.stream().filter(p->p.getTotalMarks()>totalMarks)
				.collect(Collectors.toList());
		return l;
	}
	Map<String,Float> getStudentNameAndTotalMark(){
		Map<String,Float> m = students.stream()
				.collect(Collectors.toMap(p->p.getStudName(), p->p.getTotalMarks()));
		return m;
	}
	Map<String,Float> getStudentNameAndAverage(){
		Map<String,Float> m = students.stream()
				.collect(Collectors.toMap(p->p.getStudName(), p->p.getTotalMarks()/3));
		return m;
	}
}
