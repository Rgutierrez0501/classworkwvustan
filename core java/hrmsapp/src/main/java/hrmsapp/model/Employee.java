package hrmsapp.model;

public class Employee {
	private Integer empId;
	private String empFirstName;
	private String empLastName;
	private String type;
	//HAS-A
	private Address address;
	private Location officeLocation;
	private Department department;
	public Employee() {
		
	}
	public Employee(Integer empId, String empFirstName, String empLastName, String type, Address address,
			Location officeLocation, Department department) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.type = type;
		this.address = address;
		this.officeLocation = officeLocation;
		this.department = department;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Location getOfficeLocation() {
		return officeLocation;
	}
	public void setOfficeLocation(Location officeLocation) {
		this.officeLocation = officeLocation;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", type=" + type + ", address=" + address + ", officeLocation=" + officeLocation + ", department="
				+ department + "]";
	}
	
	
}
