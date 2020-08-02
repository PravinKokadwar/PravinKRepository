package keyword_retun;



public class Demo_return {
	public static void main(String[] args) {
		int k=sum(12, 45);
		System.out.println(k);
	}
	
	static int sum(final int a,final int b)
	{
		int add ;
		add=a+b;
		return add;
	}
}