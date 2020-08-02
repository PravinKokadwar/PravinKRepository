package stringprograms;

public class TestStringStartWith

{
	public static void main(String args[])
	{
		String S1 = "I am learning JAVA";
		
	String S2 = new  String("JAVA is good programming language.");
		
	//	char arr[] = {'D','E','L','H','I'};
		
    // String S3 = new String(arr);
		
		/* boolean a = S1.startsWith("I");
		if(a) 
			System.out.println("S1 start with I ");
		else
			System.out.println("S1 does not start with I");
			
			*/
		
	   boolean b = S2.startsWith("J");
	   
	   if(b)
		   System.out.println("S2 start with J");
	   else
		   System.out.println("S2 does not start with J");
		
		
		
		
	}


}
