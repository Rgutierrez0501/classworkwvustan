package javaexample;

public class DataTypeExample {

	public static void main(String[] args) {
		int number=15;
		Employee emp = new Employee();
		//number =emp;
		//emp=number;
		double salary=5656.65;
		number=(int) salary;
		System.out.println("Value of number after type casting salary with int---"+number);
		salary=number;
		float numbertwo =5.67f;
		number=(int) numbertwo;
		System.out.println("Value of number after type casting numbertwo with int---"+number);
		numbertwo=number;
		System.out.println("Value of numbertwo after assigning number---"+numbertwo);
		
		//int index = null;

	}

}
