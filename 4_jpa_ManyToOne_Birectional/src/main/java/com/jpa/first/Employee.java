package com.jpa.first;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "EMP_DATA")//OPTIONAL
@NamedQuery(query = "select e,d from Employee e join e.department d", name = "empDeptJoin")
public class Employee {
	@Id 
	@GeneratedValue
	private int empId;
	@Column(name ="ENAME", length = 20)
	private String empName;
	@ManyToOne	
	@JoinColumn(name = "DEPT_ID")
	private Department department;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}



}
