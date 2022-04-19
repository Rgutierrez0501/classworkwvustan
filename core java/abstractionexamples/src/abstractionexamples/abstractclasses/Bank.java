package abstractionexamples.abstractclasses;

public abstract class Bank {
	Bank(){
		System.out.println("Bank object is created");
	}
	abstract int getRateOfInterest();
	
	public void loanStatus() {
		System.out.println("Your loan will approved on the basis few physical verifications");
	}
}
