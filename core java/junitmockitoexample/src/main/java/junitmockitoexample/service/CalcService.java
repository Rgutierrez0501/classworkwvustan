package junitmockitoexample.service;


public class CalcService {
	
	/**
	 * The CalcService has a dependency on AddService class. 
	 * It uses the AddService class’s add method to perform its operation.
	 */
	private AddService addService;
	
	private SubtractService  subtractService;
	
	public CalcService(AddService addService) {
		this.addService = addService;
	}
	
	public CalcService(SubtractService subtractService) {
		this.subtractService = subtractService;
	}

	public int calc(int num1, int num2) {
		System.out.println("**--- CalcService calc executed ---**");
		return addService.add(num1, num2);
	}
	
	public int sub(int num1,int num2) {
		System.out.println("**--- CalcService sub executed ---**");
		return subtractService.subtract(num1, num2);
	}

}

