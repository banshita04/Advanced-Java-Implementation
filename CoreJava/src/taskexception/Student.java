package taskexception;

class Student{
	
	private int studId;
	private String studName;
	private float m1;
	private float m2;
	private float m3;
	private float totalMarks;
	
	//setters getters, constructor with params (except totalMarks) findTotalMarks inside constructor, default constructor
	
	public Student() {
		super();
	}
	
	public Student(int studId, String studName, float m1, float m2, float m3) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.totalMarks = m1+m2+m3;
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
	
	public float getM1() {
		return m1;
	}
	
	public void setM1(float m1) {
		this.m1 = m1;
	}
	
	public float getM2() {
		return m2;
	}
	
	public void setM2(float m2) {
		this.m2 = m2;
	}
	
	public float getM3() {
		return m3;
	}
	
	public void setM3(float m3) {
		this.m3 = m3;
	}
	
	public float getTotalMarks() {
		return totalMarks;
	}
	
	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

}