package stringprograms;

public class GetCharMethodProgram 
{
	public static void main(String args[]) 
	{
	String str = "I am leanning JAVA";
	char arr[] = new char[20];
	
	str.getChars(3, 8, arr, 0);
	
	// above statement will copy str into array starting from 3rd character to 8th character.
	
	System.out.println(arr);
	// above statement will print output on console.
		
	}

}
