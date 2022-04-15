package classesdemo.ui;

public class Calculator {
	
	private Integer num1;
	private Integer num2;

	public Calculator() {
		// TODO Auto-generated constructor stub
	}

	public Calculator(Integer num1, Integer num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Integer getNum1() {
		return num1;
	}

	public void setNum1(Integer num1) {
		this.num1 = num1;
	}

	public Integer getNum2() {
		return num2;
	}

	public void setNum2(Integer num2) {
		this.num2 = num2;
	}

	/**
	 * Add two numbers of integer type
	 * Subtract two numbers of integer type
	 * Multiply two numbers of integer type
	 * Divide two numbers of integer type
	 */
	public Integer addition(Integer numberOne,Integer numberTwo) {
		return numberOne+numberTwo;
	}
	
	public Integer subtraction(Integer numberOne,Integer numberTwo) {
		return numberOne-numberTwo;
	}
	
	public Integer multiplication(Integer numberOne,Integer numberTwo) {
		return numberOne*numberTwo;
	}

	public Integer division(Integer numberOne,Integer numberTwo) {
		return numberOne/numberTwo;
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + "]";
	}
	
	
}
