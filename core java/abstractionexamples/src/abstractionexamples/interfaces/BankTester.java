package abstractionexamples.interfaces;

public class BankTester {

	public static void main(String[] args) {
	 Bank homeLoanROI = new HomeLoan();
	 System.out.println(homeLoanROI.getRateOfInterest());

	}

}
