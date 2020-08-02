package keyword_break_continue;

//break = terminate the loop or switch (break keyword is used to terminate the loop or switch)

public class Demo_break 
{
	public static void main(String[] args) 
	{
		int i = 1;
		
		while (true) 
		{
			
			System.out.println(i + ". Hello");
			
			if (i == 100)
				
			{
				break;
			}
			
			i++;
		}
	}
}