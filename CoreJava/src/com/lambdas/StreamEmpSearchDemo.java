//package com.lambdas;
//
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class StreamEmpSearchDemo {
//	static HashMap<String, Double> emps=new HashMap<>();
//public static void main(String[] args) {
//	addEmp("X",5000);
//	addEmp("Y",1000);
//	addEmp("Z",2000);
//	addEmp("A",7000);
//	EmployeeAudit empAudit=findEmp();
//	
//	List<String>list=empAudit.fetchEmployeeDetails(5000);
//	System.out.println(list);
//}
//private static void addEmp(String empName, double sal) {
//	emps.put(empName, sal);
//}
////returns Lambda ......
//static EmployeeAudit findEmp() {
//	List<String> empList=new ArrayList<>();
//	EmployeeAudit empAudit= (salary)->{
//		Set<Map.Entry<String, Double>> rows=emps.entrySet();
//		for(Map.Entry<String,Double> r:rows) {
//			if(r.getValue()<=salary) {
//				empList.add(r.getKey());
//			}
//		}
//		return empList;
//	};
//	return empAudit;
//}
//}
//
//
