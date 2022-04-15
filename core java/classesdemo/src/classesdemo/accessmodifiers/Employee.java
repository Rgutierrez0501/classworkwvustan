package classesdemo.accessmodifiers;

import java.time.LocalDate;

public class Employee {

	private Integer empId;
	private String empName;
	private LocalDate dateOfBirth;
	
	public Employee() {}
	public Employee(Integer empId, String empName, LocalDate dateOfBirth) {
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * Below two methods are helper or utility methods to convert String to LocalDate or vice -versa
	 */
	private void convertStringDateToLocalDate() {
		int i =0;// scope of variable i is within this method block
		System.out.println(i);
		
	}
	
	private void convertLocalDateToStringDate() {
		System.out.println("hi");
	}
}
