package oopsconcepts;

class ABC 
{
	ABC() // This is Constructor of class ABC, Constructor name (ABC) and Class name (ABC) should be same always. 
	{
		System.out.println("in ABC Constructor");
	}
	
	ABC(int x) // Constructor name and Class name should be same always.
	{
		System.out.println("in ABC Construcrtor: "+x);
	}
}

class PQR extends ABC // Class PQR inherit all the variable/methods from class ABC. 
{
	PQR() 
	{
		super(20);
		System.out.println("in PQR Constructor");
	}
}

class XYZ extends PQR 
{
	XYZ()
	{
		System.out.println("in XYZ Constructor");
	}
}

public class ConstructorDemo 
{
	public static void main(String[] args) 
	{
		XYZ x = new XYZ();
	}
}