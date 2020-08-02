package practice;

public class PalandromeNumber {

	public static void main(String args[]) {

		int n = 575;
		int r, sum = 0, temp;

		temp = n;
		while (n > 0) {
			r = n % 10;   
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {

			System.out.println("The number is palandrome");
		} else {

			System.out.println("The Number is not palandrome");
		}

	}

}
