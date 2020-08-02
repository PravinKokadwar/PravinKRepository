package starPatternsPrograms;

public class StarProg4 {

	public static void main(String args[]) {

		for (int i = 0; i <= 4; i++) {

			for (int j = 3; j >= i; j--) { // this loop is for spaces

				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {

				System.out.print("*");
			}

			System.out.println();
		}

	}

}
