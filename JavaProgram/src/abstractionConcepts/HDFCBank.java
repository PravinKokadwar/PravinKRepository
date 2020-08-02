package abstractionConcepts;

public class HDFCBank extends Bank {

	public void loan() // This is overridden method as this is method only defined in parent class.

	{

		System.out.println("HDFC -- loan Method"); // This method is abstract method is parent class Bank, here we write
													// implemention.

	}

	public void funds() {

		System.out.println("HDFC -- Funds Method");
	}

}
