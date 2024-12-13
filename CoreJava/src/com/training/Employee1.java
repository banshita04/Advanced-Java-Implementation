package com.training;

public class Employee1 {
	private int empId;
	private String empName;
	private float salary;

	public Employee1(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [empId=" + empId + ", empName=" + empName + ", salary=" 
				+ salary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() 
				+ ", toString()=" + super.toString() + "]";
	}
}
