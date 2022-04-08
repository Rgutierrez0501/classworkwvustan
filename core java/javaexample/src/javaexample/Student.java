package javaexample;

public class Student {

	private int studentId;
	private String studentName;
	
	//Default Constructor
	public Student() {
		
	}
//Parameterized Constructor
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	/**
	 * 
	 * Getter Setter methods
	 */
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

	//To String to display the values of an object's properties or fields
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}
	

}
