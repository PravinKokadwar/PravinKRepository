package arrayexamples;

public class TwoDArrayAdv {
	public static void main(String[] args) {
		int a[][] = { { 34, 56, 78, 79 }, { 21, 45, 57, 87 } };

		System.out.println(a.length);

		System.out.println(a[0].length);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("----");

		for (int k[] : a) {
			for (int t : k) {
				System.out.print(t + " ");
			}
			System.out.println();
		}
	}
}