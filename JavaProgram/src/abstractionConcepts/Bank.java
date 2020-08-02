package abstractionConcepts;

public abstract class Bank {
	
	// Cannot create the object of abstract class.
	
	
	
	int amt = 200;
	final int rate = 10;
	static int loanRate = 5;
	

	public abstract void loan(); // This is abstract method -- method without body/implemention

	public void Credit() {

		System.out.println("Bank -- Credit Method");
	}

	public void Debit() {

		System.out.println("Bank -- Debit Method");
	}

}
