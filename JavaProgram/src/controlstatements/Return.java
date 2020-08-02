package controlstatements;

public class Return {

	public static void main(String[] args) 
	{
		int k=sum(23, 56);
		System.out.println(k+2);
	}
	
	static int sum(int a,int b)
	{
		int add=a+b;
		return add;
	}
}
