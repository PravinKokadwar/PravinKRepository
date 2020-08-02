package interviewQuestions;

public class RemoveSpecialChar {

	public static void main(String args[]) {

		// Question:- How to remove special characters from the string ?

		// Ans:- Need to use Regular Expression[^a-zA-Z0-9] + replaceAll() method

		String str = "@#$%^^0 MumbaiPune 219483258 fhdsjkfh ";

		str = str.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(str);

	}
}
