package interfaceConceptbyNaveenAutomation;

public class Testbank {

	public static void main(String args[]) {

		System.out.println(USBank.min_bal); 
		
		CITIBank cb = new CITIBank();
		cb.credit();
		cb.debit();
		cb.DepositMoney();
		cb.educationLoan();
		cb.carLoan();
	    cb.mutualFunds();
	    cb.overDraft();

		// Dynamic Polymorphism
		// Child class object can be referred by parent interface reference variable

		USBank ub = new CITIBank();
		ub.credit();
		ub.debit();
		ub.DepositMoney();

	}

}
