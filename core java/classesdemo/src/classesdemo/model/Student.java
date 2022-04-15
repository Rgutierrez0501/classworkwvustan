package classesdemo.model;

public class Student {
	//instance variable or fields of Student class or 
	//properties of student object
	private Integer studentId;
	private String studentName;
	//static variable or field of Student class
	//static is a reserved keyword in Java.By making a variable static means it will share same the value to an object class containing
	public static Integer age;
	//No-arg constructor or default constructor
	public Student() {

	}
	//Parameterized constructor
	public Student(Integer studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public Student(Integer studentId) {
		this.studentId=studentId;
	}
	
	public Student(String studentName) {
		this.studentName=studentName;
	}
	
	
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	
	public static void display() {
		//System.out.println(this.studentId);
		System.out.println(age);
	}
}
