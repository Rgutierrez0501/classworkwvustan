package junitmockitoexample.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalcService1Test {

	@Test
	void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

		AddService addService;
		CalcService calcService;
		System.out.println("**");
		addService = Mockito.mock(AddService.class);
		System.out.println("****");
		calcService = new CalcService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}
	
	@Test
	void testCalcSub() {
		SubtractService subtractService;
		CalcService calcService;
		
		subtractService = Mockito.mock(SubtractService.class);
		calcService = new CalcService(subtractService);
		int num1 = 16;
		int num2 = 1;
		int expected = 15;
		
		when(subtractService.subtract(num1, num2)).thenReturn(expected);
		
		int actual = calcService.sub(num1, num2);
		
		assertEquals(expected,actual);
		
		
	}
}
