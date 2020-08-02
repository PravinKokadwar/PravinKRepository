package keyword_retun;

public class Demo {
	public static void main(String[] args) {
		sum();
		sum();
		sum(10, 50);
		sum(45, 5);
	}
	
	static void sum()
	{
		int a=19,b=21;
		System.out.println(a+b);
	}
	
	static void sum(int a, int b)
	{
		int add=a+b;
		System.out.println(add);
	}
}