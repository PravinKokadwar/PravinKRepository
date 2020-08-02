package interviewQuestions;

public class MissingNumber {

	public static void main(String args[]) {

		int a[] = { 1, 2, 4, 5 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) { // This loop1 is adding 1+2+4+5 = 12

			sum = sum + a[i];

		}

		System.out.println(sum);

		int sum1 = 0;
		for (int j = 0; j <= 5; j++) { // This loop2 is used to add 1+2+3+4+5 = 15

			sum1 = sum1 + j;
		}

		System.out.println(sum1);

		System.out.println("The misssing number is " + (sum1 - sum)); // This is used loop2-loop1 = missing number, here
																		// we know the exact loop
	}

}
