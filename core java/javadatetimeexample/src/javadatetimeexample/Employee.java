package javadatetimeexample;

import java.util.Date;

public class Employee {

	private Integer empId;
	private String empName;
	private Date dateOfBirth;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Integer empId, String empName, Date dateOfBirth) {
		this.empId = empId;
		this.empName = empName;
		this.dateOfBirth = dateOfBirth;
	}



	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", dateOfBirth=" + dateOfBirth + "]";
	}
	


}
