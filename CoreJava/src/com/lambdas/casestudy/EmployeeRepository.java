package com.lambdas.casestudy;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	public List<Employee> getEmployees(){
		Department d1=new Department(991, "IT", 1001);
		Department d2=new Department(992, "Accounts", 1002);
		Department d3=new Department(993, "Marketting", 1003);
		Department d4=new Department(994, "HR", 1004);

		Employee e1=new 
				Employee(1,"Swati", "MD","swati@cg.com", 1223456, 
						LocalDate.of(2010, 2, 5), "Manager", 50000, 4, d4);
		Employee e2=new 
				Employee(2,"Rani", "Bisht","rani@cg.com", 124566, 
						LocalDate.of(2014, 6, 4), "SSE", 40000, 1, d4);
		Employee e3=new 
				Employee(3,"Khushi", "Chaurasia","khushi@cg.com", 122346, 
						LocalDate.of(2015, 9, 9), "SE", 45000, 1, d2);
		Employee e4=new 
				Employee(4,"Manisha", "Shaik","manisha@cg.com", 12345, 
						LocalDate.of(2020, 1, 20), "Engineer", 50000, 2, d1);
		Employee e5=new 
				Employee(5,"Tripti", "G","tripti@cg.com", 907345, 
						LocalDate.of(2021, 1, 15), "Engineer", 25000, 1, d3);
		Employee e6=new 
				Employee(6,"CM", "CM","cm@cg.com", 134456, 
						LocalDate.of(2022, 4, 10), "Engineer", 40000, 2, d1);
		Employee e7=new 
				Employee(7,"KM", "KM","km@cg.com", 345345, 
						LocalDate.of(2023, 12, 4), "SSE", 45000, 0, d1);
		Employee e8=new 
				Employee(8,"Vaishu", "NR","vaishu@cg.com", 34566, 
						LocalDate.of(2023, 12, 8), "SE", 35000, 7, d2);
		List<Employee> empList=new ArrayList<>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		return empList;
	}
}
