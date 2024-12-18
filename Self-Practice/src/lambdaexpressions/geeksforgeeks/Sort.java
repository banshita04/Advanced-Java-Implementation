package lambdaexpressions.geeksforgeeks;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Sort {
	public static void main(String[] args) {
		List<Department> deptList = new ArrayList<>();
		deptList.add(new Department( 11,"Science", 190));
		deptList.add(new Department( 121,"Commerce", 170));
		deptList.add(new Department( 10,"Arts", 90));
		deptList.add(new Department( 99,"Games", 10));

		deptList.sort(Comparator.comparing(Department::getDeptId));
		
		for(Department d: deptList) {
			System.out.println(d.getDeptId()+" "+d.getDeptName()+" "+d.getDeptStrength());
		}
	}
}

class Department{
	private int deptId;
	private String deptName;
	private int deptStrength;
	public Department(int deptId, String deptName, int deptStrength) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptStrength = deptStrength;
	}
	public int getDeptId() {
		return deptId;
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
	public int getDeptStrength() {
		return deptStrength;
	}
	public void setDeptStrength(int deptStrength) {
		this.deptStrength = deptStrength;
	}
	
	
}
