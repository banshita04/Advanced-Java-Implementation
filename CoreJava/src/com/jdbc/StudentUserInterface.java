package com.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentUserInterface {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter id");
 int sid=sc.nextInt();
 System.out.println("Enter stud name");
 String sname=sc.next();
 System.out.println("Enter marks");
 float marks=sc.nextFloat();
 System.out.println("Enter stud address");
 String address=sc.next();
 System.out.println("Enter course name");
 String course=sc.nextLine();
 Student s=new Student(sid, sname, marks, address, course);
 StudentUserInterface studInterface=new StudentUserInterface();
 studInterface.addNewStudent(s);;
		 
}

void addNewStudent(Student s) {
	//parameterized query.
	//values will get from user
	String sql="insert into Student values(?,?,?,?,?)";
	Connection con=DBConnection.dbConnect();
	try {
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, s.getStudId());
		pstmt.setString(2, s.getStudName());
		pstmt.setFloat(3, s.getMarks());
		pstmt.setString(4, s.getAddress());
		pstmt.setString(5, s.getCourse());
		int c=pstmt.executeUpdate();
		System.out.println(c+" rows affected .....");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
}
}
