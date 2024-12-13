package com.jdbc;

public class Student {
private int studId;
private String studName;
private float marks;
private String address;
private String course;
public Student(int studId, String studName, float marks, String address, String course) {
	super();
	this.studId = studId;
	this.studName = studName;
	this.marks = marks;
	this.address = address;
	this.course = course;
}
public int getStudId() {
	return studId;
}
public void setStudId(int studId) {
	this.studId = studId;
}
public String getStudName() {
	return studName;
}
public void setStudName(String studName) {
	this.studName = studName;
}
public float getMarks() {
	return marks;
}
public void setMarks(float marks) {
	this.marks = marks;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}


}
