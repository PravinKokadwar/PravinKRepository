package exceptionHandling;

public class ExceptionAdv 
{
	public static void main(String[] args) {
		try {
			divide();
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException anpe)
		{
			System.out.println("in AE");
		}
	}
	
	static void divide()
	{
		System.out.println(5/0);
	}
}