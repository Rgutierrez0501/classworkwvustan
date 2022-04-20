package collectionsexamplelist.entity;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private Integer studentId;
	private String firstName;
	private String lastName;

	public Student() {

	}

	public Student(Integer studentId, String firstName, String lastName) {
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	@Override
	public int compareTo(Student o) {
		if (this.getStudentId() == o.studentId) {
			return 0;
		} else {
			return this.studentId > o.studentId ? 1 : -1;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(studentId, other.studentId);
	}



}
