package hrmisapp.data;

public class Employee {

	private int empId;
	private String empName;
	private int age;
	private double salary;
	private String jobTitle;
	private String dept;
	
	
	public Employee(int empId, String empName, int age, double salary, String jobTitle, String dept) {
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
		this.jobTitle = jobTitle;
		this.dept = dept;
	}
	public Employee() {
		
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary
				+ ", jobTitle=" + jobTitle + ", dept=" + dept + "]";
	}
	
	
	

}
