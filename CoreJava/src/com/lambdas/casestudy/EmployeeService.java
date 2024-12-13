package com.lambdas.casestudy;

import java.util.List;

public class EmployeeService {
	public static void main(String[] args) {
		List<Employee> empList=new EmployeeRepository().getEmployees();

	}
}