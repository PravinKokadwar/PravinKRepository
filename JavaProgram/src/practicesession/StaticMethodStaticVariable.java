package practicesession;

class sample4 {
	static int a = 67;  // static variable declared as a = 54.
	
	static void access ()  // static method declared as access()
	{
		System.out.println("a=" +a);
		
	}
}
public class StaticMethodStaticVariable 
{
public static void main(String[] args) 
{
		sample4.access(); //Classname.methodname 
}

}
