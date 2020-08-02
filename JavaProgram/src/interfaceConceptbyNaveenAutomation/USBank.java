package interfaceConceptbyNaveenAutomation;

public interface USBank {

	int min_bal = 200; // This variable is Final Static in nature by default.
	int max_bal = 200000;

	public void credit();

	public void debit();

	public void DepositMoney();

	// Only Method declaration
	// No method body -- only Method prototype
	// Variables is Interface are "Final Static" (Cannot change the values once
	// declared) in nature
	// No Static method declaration in Interface
	// No main method declaration in Interface
	// We cannot create object of Interface
	// Interface is abstract in nature

	// from JDK1.8, We can have static method in interface but with method body
	// static method with method body

	public static void withDrawal() {

		System.out.println("Custoemrs can with draw money any time");
	}

	default void xChange() {
		System.out.println("Customer can exchange the currency");

	}

}
