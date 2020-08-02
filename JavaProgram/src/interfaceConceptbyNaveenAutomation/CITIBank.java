package interfaceConceptbyNaveenAutomation;

public class CITIBank extends SBIBank implements USBank, BrazilBank {

	//Problem Statement: CITIBank wants to open there branch in US, but for that they have to follow few interfaces 
	//from US bank regulatory.
	
	// Thumb Rule :If class implements any interface , then it is mandatory to
	// define/override all the methods of Interface.

	/*public void credit() {

		System.out.println("Money got Credited");
	}*/

	public void debit() {

		System.out.println("Money got Debited");
	}

	public void DepositMoney() {

		System.out.println("Deposited money completed");

	}

	public void educationLoan() {

		System.out.println("CITI Bank provides EDUCATION loan");
	}

	public void carLoan() {

		System.out.println("CITI Bank provides CAR loan");
	}

	public void mutualFunds() {

		System.out.println("Brazil bank provides Loan");
	}

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		
	}
}
