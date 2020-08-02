package exceptionHandling;

class InvalidInterestException extends RuntimeException 
{
	InvalidInterestException() {
		super("Interest is invalid");
	}
}

public class Keyword_throw 
{
	public static void main(String[] args) {
		try {
			calculateInterest();
		} catch (InvalidInterestException e) {
			System.out.println("Correct your interest rate...");
		}
	}

	static void calculateInterest() {
		int interest = -15;

		if (interest < 0 || interest > 50) {
			throw new InvalidInterestException(); // We can throw only one exception at a time. Generally, We use
													// 'throw' keyword to throw custom exceptions.
		} else {
			System.out.println("Interest is acceptable");
		}
	}
}