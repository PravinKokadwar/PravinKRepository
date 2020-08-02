package practicesession;

public class MethodProgram {
	private double num1, num2; // this are instance variable.

	MethodProgram(double x, double y) // Parameterized Constructor.
	{
		num1 = x;
		num2 = y;

	}

	void sum() // Method to calculate sum of num1,num2 also this method does not accept any
				// value and return any value.
	{
		double res = num1 + num2;
		System.out.println("Sum= " + res);

	}
}

class Method // main class Method.
{
	public static void main(String[] args) // Main method.
	{
		MethodProgram MP = new MethodProgram(10, 20); // creating objects and passing values 10,20 to constructors.They
														// will be shared into num1 and num2.
		MP.sum();
	}
}
