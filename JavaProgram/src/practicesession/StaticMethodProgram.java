package practicesession;

class Sample2
{
static double sum(double num1, double num2) // Static method should be displayed with word static. 
{
double res = num1 + num2;
return res;   //return the result.
} 	
}

public class StaticMethodProgram {

	public static void main(String args[]) {
		double x = Sample2.sum(23,56.5); // Classname.methodname
		System.out.println("Sum=" +x);
	}
	
}

// Static method are called using Classname.methodname();

