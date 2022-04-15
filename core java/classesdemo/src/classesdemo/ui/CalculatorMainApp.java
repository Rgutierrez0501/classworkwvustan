package classesdemo.ui;

public class CalculatorMainApp {


	public static void main(String[] args) {
		Calculator calculator = new Calculator();//No arg constructor method is used to create an object
		//After creating an object we are setting values to objects fields or properties or variables
		calculator.setNum1(15);
		calculator.setNum2(10);
		//calculator.addition(1,5);
		Integer addResult =calculator.addition(calculator.getNum1(), calculator.getNum2());
		System.out.println("Addition of two numbers "+calculator.getNum1()+" and "+calculator.getNum2()+" is "+addResult);

		
		Calculator calc = new Calculator(11, 10);//Parameterized constructor method is used to create an object
		Integer subResult = calc.subtraction(calc.getNum1(), calc.getNum2());
		System.out.println("Subtraction of two numbers "+calc.getNum1()+" and "+calc.getNum2()+" is "+subResult);
			
		
		Calculator calcul = new Calculator(11, 10);//Parameterized constructor method is used to create an object
		Integer mulResult = calc.multiplication(calcul.getNum1(), calcul.getNum2());
		System.out.println("Multiplication of two numbers "+calcul.getNum1()+" and "+calcul.getNum2()+" is "+mulResult);

	}

}
