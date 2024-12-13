package com.cg.oop;

public class Student {
	private int studId;
	private String studName;
	private float totalMarks;
	private static String courseName;

	public int getStudId() {
		return studId;
	}
	public void setStudId(int id) {
		studId = id;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public float getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}
	public static String getCourseName() {
		return courseName;
	}
	public static void setCourseName(String courseName) {
		Student.courseName = courseName;
	}
}

