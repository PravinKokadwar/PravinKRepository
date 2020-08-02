package interviewQuestions;

import java.util.Arrays;

public class LargestSmallestNumbers {

	public static void main(String args[]) {

		int numbers[] = { -10, 24, 255, 689, -90,-100,-1000	,984587 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (numbers[i] > largest) {
				largest = numbers[i];

			} else if (numbers[i] < smallest) {

				smallest = numbers[i];
			}

		}

		System.out.println("The given array is ::" + Arrays.toString(numbers));
		System.out.println("The largest number is ::" + largest);
		System.out.println("The smallest number is ::" + smallest);

	}

}
