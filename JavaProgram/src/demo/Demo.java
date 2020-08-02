package demo;

class ABC<T,U> // T and U are type names.
{
	T a;
	U b;
	
	public void setA(T a, U b)
	{
		this.a=a;
		this.b=b;
	}
	
	public T getA()
	{
		return a;
	}
	
	public U getB()
	{
		return b;
	}
}

public class Demo {
	public static void main(String[] args) {
		ABC<String,Integer> a=new ABC<String,Integer>();// When we use this statement String will be assigned to T and Integer will be assigned to U. The whole class will behave for this given types.
		a.setA("jgb",56);
		System.out.println(a.getA()+ a.getB());
		
		ABC<Integer,Integer> ai=new ABC<Integer,Integer>();
		ai.setA(23,56);
		System.out.println(ai.getA()+ai.getB());
	}
}