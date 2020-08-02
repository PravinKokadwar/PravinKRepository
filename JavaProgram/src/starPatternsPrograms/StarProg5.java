package starPatternsPrograms;

public class StarProg5 {

	public static void main(String args[]) {

		for (int i = 0; i <=4; i++) {

			for (int j = 3; j >= i; j--) { // this loop is for spaces

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}

			System.out.println();
		}

		for (int i = 0; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(" ");
			}

			for (int k = 3; k >= i; k--) {

				System.out.print("*");
			}
			System.out.println();
		}

	}

}
