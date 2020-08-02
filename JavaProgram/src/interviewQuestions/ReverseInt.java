package interviewQuestions;

public class ReverseInt {

	public static void main(String args[]) {

		// Question:- How to Reverse an Integer ?
		// Answer:-

		//Method1) Using proper algorithm 
		
		int num = 56789;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("The reverse of the given number is:- " + rev);
		
		//Method2) Using StringBuffer
		
		int num1 = 85236;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
