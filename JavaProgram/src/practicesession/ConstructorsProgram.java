package practicesession;

class man
{
	String name;
	int age;
	
	man()
	{
	name = "pravin";
	age = 32;
  	}
	
	void talk()
	{
		System.out.println("I am SuperStar" + name);
		System.out.println("My age is" +age);
	}
}

public class ConstructorsProgram {
	public static void main(String args[])
	{
		man pravin = new man();
		
		pravin.talk();
		
		man sita = new man();
		
		sita.talk();
		
	}
}
