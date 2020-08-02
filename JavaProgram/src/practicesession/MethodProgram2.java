package practicesession;

class Sample1 {
	double sum(double num1, double num2) // This method accept two double value and also return double type result.
	{
		double res = num1 + num2;
		return res;
	}
}

public class MethodProgram2 {

	public static void main(String[] args) {
		Sample1 S1 = new Sample1(); // Creating object of class Sample1 as S1
		double x = S1.sum(10, 22.5);
		System.out.println("Sum=" + x);
	}

}

// Program for a method with two parameter and a return type.
//
