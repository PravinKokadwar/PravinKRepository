package oopsconcepts;

class Bank
{
	private int interest;
	
	public void setInterest(int interest)
	{
		if(interest<0)
		{
			System.out.println("Interest can't be negative.");
		}
		
		else
		    
			this.interest=interest;
	}
	
	public int getInterest()
	
	{
		return interest;
	}
}

public class Demo_Encapsulation 
{
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.setInterest(-9);
		System.out.println(b.getInterest());
	}
}