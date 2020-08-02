package oopsconcepts;

public class FunctionOverloading 
{
	public static void main(String[] args) 
	{
		sum(52);
		sum(53.1f, 98.5f);
		sum(65,78);
		sum();
	}
	
	static void sum()
	{
		System.out.println(98);
	}
	
	static void sum(int a)
	{
		System.out.println(a+67);
	}
	
	static void sum(int a, int b)
	{
		System.out.println(a+b);
	}
	
	static void sum(float k,float j)
	{
		System.out.println(k+j);
	}
}