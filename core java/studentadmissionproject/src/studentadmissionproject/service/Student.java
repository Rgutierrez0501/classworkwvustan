package studentadmissionproject.service;

import java.util.Arrays;
import java.util.Date;

public class Student {
	private Integer admissionCode;
	private String studentName;
	private Date birthdate;
	private Integer[] marks; // array to hold marks in 3 subjects
	private String grade;
	private static Integer admissionCounter;
	private static String schoolName;

	static {
		schoolName = "Hyderabad Public School";
	}

	public Student() {
		admissionCounter++;
	}

	public Student(String studentName, Date birthdate) {
		this.studentName = studentName;
		this.birthdate = birthdate;
	}

	public Student(String studentName, Date birthdate, Integer[] marks) {
		this.studentName = studentName;
		this.birthdate = birthdate;
		this.marks = marks;
	}

	public Integer getAdmissionCode() {
		return admissionCode;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public Integer[] getMarks() {
		return marks;
	}

	public void setMarks(Integer[] marks) {
		this.marks = marks;
	}

	public String getGrade() {
		return grade;
	}

	public static Integer getAdmissionCounter() {
		return admissionCounter;
	}

	public static String getSchoolName() {
		return schoolName;
	}

	public static void setSchoolName(String schoolName) {
		Student.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [admissionCode=" + admissionCode + ", studentName=" + studentName + ", birthdate=" + birthdate
				+ ", marks=" + Arrays.toString(marks) + ", grade=" + grade + "]";
	}

}
