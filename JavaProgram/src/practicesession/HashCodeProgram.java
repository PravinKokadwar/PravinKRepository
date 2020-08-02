package practicesession;

class person
{
	String name;
	int age;
	
	void talk()
	
	{
		System.out.println("Hello I am" + name);
		System.out.println("Working with" + age);
	}
}

class HashCodeProgram{
	
	public static void main(String args[])
	{
		
		person pravin = new person();
		
		System.out.println("Hash Code " +pravin.hashCode());
	}
}

/* Hash code (Reference Number) is UNIQUE identification number allocated to the objects by the JVM. 
hashcode() method is used to find out the hash code of any object  */