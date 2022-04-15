package classesdemo.model;

public class Customer {
	
	private Integer custId;
	private String custName;
	
	//No arg constructor or default constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized constructor or overloaded constructor method
	public Customer(Integer custId, String custName) {
		this.custId = custId;
		this.custName = custName;
	}
	
	public Customer(Integer custId) {
		this.custId = custId;
	}
	
	public Customer(String custName) {
		this.custName = custName;
	}

	public Integer getCustId() {
		return custId;
	}

	//below method is not returning anything
	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	public String display(){
		System.out.println("I am inside display method");
		/**
		String message ="I am returning";
		return message;
		**/
		return "I am returning";
	}
	
	public void showMessage() {
		int x=15;
		int y=10;
		int result=x+y;
		System.out.println(result);
		System.out.println("I am inside showMessage method");
	
	}
	
	public int addition(int x,int y) {
		return x+y;
	}

}
