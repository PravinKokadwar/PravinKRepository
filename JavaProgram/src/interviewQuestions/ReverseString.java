package interviewQuestions;

public class ReverseString {

	public static void main(String args[]) {

		//Question: How to reverse the string
		//Difference between String(Immutable) and StringBuffer(Mutable)
		//Do we have reverse function in string?  NO
		
		String str = "Automation";

		// Using for loop

		/*
		 * int len = str.length(); String rev = ""; for (int i = 9; i >= 0; i--) {
		 * 
		 * rev = rev + str.charAt(i); }
		 * 
		 * System.out.println("The reversed string is " + rev);
		 */

		// Using StringBuffer

		StringBuffer strbf = new StringBuffer(str);
		System.out.println(strbf.reverse());

	}

}
