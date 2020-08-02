package keyword_break_continue;

//continue - terminate the current iteration (continue keyword is used to terminate the current iteration)

public class Demo_continue 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 200; i++) 
		{
			if(i%3==0) 
			{
				continue;
			}
			
			System.out.println(i);
		}
	}
}