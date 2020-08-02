package practicesession;

class person1
   {
	String name;
	int age;
	
	void talk()
	{
		System.out.println("Hello I am" + name);
		System.out.println("My age is " + age);
	}
}
public class CallMethod
{
	public static void main(String args[])
	
	{
	 
	 person Pravin = new person();
	 Pravin.name = "Pravin"; // initializing the instance variable using reference.
	 Pravin.age = 32; // initializing the instance variable using reference.
	 Pravin.talk(); // call the talk() method
		
	}

}
