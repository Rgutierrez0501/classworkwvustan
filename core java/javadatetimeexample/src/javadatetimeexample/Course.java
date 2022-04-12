package javadatetimeexample;

import java.time.LocalDate;

public class Course {
	
	private Integer courseId;
	private String courseDetails;
	private LocalDate enrolledDate;
	
	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseDetails() {
		return courseDetails;
	}

	public void setCourseDetails(String courseDetails) {
		this.courseDetails = courseDetails;
	}

	public LocalDate getEnrolledDate() {
		return enrolledDate;
	}

	public void setEnrolledDate(LocalDate enrolledDate) {
		this.enrolledDate = enrolledDate;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseDetails=" + courseDetails + ", enrolledDate=" + enrolledDate
				+ "]";
	}

}
