package com.cg.oop;

public class StaticDemo1 {
public static void main(String[] args) {
	//new Student();
	Student.setCourseName("Java");
	System.out.println(Student.getCourseName());

	Student s1=new Student();
	s1.setStudId(101);
	s1.setStudName("banshita");
	s1.setTotalMarks(99.5f);
	
	Student s2=new Student();
	s2.setStudId(102);
	s2.setStudName("ankita");
	s2.setTotalMarks(99.9f);
	
	System.out.println(s1.getStudName()+" scored "+s1.getTotalMarks()+
			" in "+Student.getCourseName());
	Student.setCourseName("Adv. Java");
	System.out.println(s2.getStudName()+" scored "+s2.getTotalMarks()+
			" in "+Student.getCourseName());
	
	}
}