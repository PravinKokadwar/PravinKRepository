package exceptionHandling;

public class Keyword_finally 
	{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a = new int[1];
			a[0] = 90;
			System.out.println(3/0);
		} 
		catch (ArithmeticException AE)
		
		{
			System.out.println("in AE");
		}
		finally 
		{
			System.out.println("Hello");
		}
       
	}
}