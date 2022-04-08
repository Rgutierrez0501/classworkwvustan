package javaexample;

public class Employee {
	//In Java everything is an object
	private Integer empId; //empId is of type Integer
	private String empName; //empName is of type String
	private Address address;// address is of type Address class
	public  static double valueOfPI=3.14;
	
	
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
		System.out.println(valueOfPI);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", address=" + address + "]";
	}
	

}
