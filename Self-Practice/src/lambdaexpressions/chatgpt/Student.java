package lambdaexpressions.chatgpt;

public class Student {
	private int studentId;
	private String studentName;
	private String grade;
	private int score;
	public Student(int studentId, String studentName, String grade, int score) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
		this.score = score;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
