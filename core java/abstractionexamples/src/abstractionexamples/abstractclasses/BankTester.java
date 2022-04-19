package abstractionexamples.abstractclasses;

public class BankTester {

	public static void main(String[] args) {
	 Bank fourWheelerROI = new FourWheelerLoan();
	 System.out.println(fourWheelerROI.getRateOfInterest());
	 
	 Bank homeLoanROI = new HomeLoan();
	 System.out.println(homeLoanROI.getRateOfInterest());
	 //Bank bank = new Bank();
	 homeLoanROI.loanStatus();
	}

}
