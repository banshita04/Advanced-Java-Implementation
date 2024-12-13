package com.lambdas.casestudy;

public class Department {
	private int deptId;
	private String deptName;
	private int managerId;
	//setter and getter 
	//constructor with params

	public int getDeptId() {
		return deptId;
	}
	public Department(int deptId, String deptName, int managerId) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.managerId = managerId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

}
