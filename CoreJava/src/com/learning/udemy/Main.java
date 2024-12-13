package com.learning.udemy;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("Jane", "Jones", 123));
		employeeList.add(new Employee("John", "Doe", 111));
		employeeList.add(new Employee("Mary", "Smith", 121));
		employeeList.add(new Employee("Mike", "Wilson", 321));
		
//		employeeList.forEach(employee->System.out.println(employee));
//		System.out.println(employeeList.get(1));
//		System.out.println(employeeList.isEmpty());
		employeeList.set(1, new Employee("Banshita", "Datta Roy", 1699));
		employeeList.forEach(employee->System.out.println(employee));

		
	}
}
