package stringprograms;

public class SplitingStringOperation {

	public static void main(String args[])
	{
		String str = " I am learning JAVA daily";
		// above sting we will need to be broken.
		
		String S[];
		// declare a string type array S to store pieces.
		
		S = str.split(" ");
		// split the string where a space is found in str
		
		
		for (int i=0;i<S.length;i++)
		{
			System.out.println(S[i]);
		
		}
				// display the pieces from s.
				
		
		
	}
	
}
