package junitmockitoexample.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class CalcService2Test {

	CalcService calcService;

	@Mock
	AddService addService;

	@Mock
	SubtractService subService;

	@BeforeEach
	public void setup() {
		// initMocls() method is called to initialize objects annotated with @Mock,
		// @Spy,@Captor or @InjectMocks
			//MockitoAnnotations.initMocks(this);
			MockitoAnnotations.openMocks(this);
		

	}

	@Test
	public void testCalc() {
		System.out.println("**--- Test testCalc executed ---**");

		calcService = new CalcService(addService);

		int num1 = 11;
		int num2 = 12;
		int expected = 23;

		when(addService.add(num1, num2)).thenReturn(expected);

		int actual = calcService.calc(num1, num2);

		assertEquals(expected, actual);

	}
	
	@Test
	public void testCalcSub() {
		calcService = new CalcService(subService);
		int num1 = 16;
		int num2 = 14;
		int expected = 2;

		when(subService.subtract(num1, num2)).thenReturn(expected);

		int actual = calcService.sub(num1, num2);

		assertEquals(expected, actual);
	}
}
