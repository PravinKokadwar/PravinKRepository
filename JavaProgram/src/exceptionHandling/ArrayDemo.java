package exceptionHandling;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] a = new int[2];
		try {
			try {
				a[0] = 56;
				a[1] = 78;
				a[2] = 34; // throw new ArrayIndexOutOfBoundsException();
			} catch (ArrayIndexOutOfBoundsException aioob) {
				System.out.println("Invalid index");
			}

			try {

				String s = null;
				System.out.println(s.charAt(0)); // throw new NullPointerException();

			} catch (ArithmeticException e) {
				System.out.println("Some Arithmetic Exception");
			}

		} catch (Exception e) {
			System.out.println("some other exception");
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}
}