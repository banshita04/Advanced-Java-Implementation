package lambdaexpressions.chatgpt;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> employeeList = List.of(
				new Employee(1, "Alice", "HR", 55000),
				new Employee(2, "Bob", "Engineering", 75000),
				new Employee(3, "Charlie", "HR", 65000),
				new Employee(4, "David", "Engineering", 50000),
				new Employee(5, "Eve", "Engineering", 120000),
				new Employee(6, "Frank", "Marketing", 70000),
				new Employee(7, "Grace", "Marketing", 45000)
				);

		Map<String, Double> empMap = getHighestSalaryByDepartment(employeeList);

		for(Map.Entry<String, Double> entry : empMap.entrySet()) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
		}
	}

	public static Map<String, Double> getHighestSalaryByDepartment(List<Employee> empList){
		
		return empList.stream()
				.filter(employee -> employee.getSalary() >= 60000)
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.collectingAndThen(
								Collectors.maxBy((e1, e2) -> 
								Double.compare(e1.getSalary(), e2.getSalary())),
								opt -> opt.get().getSalary())
						));

		//				empList
		//				.stream()
		//				.filter(emp->emp.getSalary()<60000)
		//				.collect(Collectors
		//						.groupingBy(Employee::getDepartment,
		//								Collectors.maxBy((s1,s2)->Double
		//										.compare(s1.getSalary(),s2.getSalary())),opt->opt.));
	}


}
