package exceptionHandling;

public class ArithemticDemo {
	public static void main(String[] args) {

		try {
			int a = 10, b = 2;
			System.out.println(a / b); // throw new ArithmeticException();
			System.out.println("Hi");
			String s = "Hello";
			System.out.println(s.charAt(0));
			int i[] = new int[1];
			i[1] = 90; // throw new ArrayIndexOutOfBoundException();
		} catch (ArithmeticException ae) {
			System.out.println("trying to divide by zero...");
		} catch (NullPointerException npe) {
			System.out.println("Handle NPE...");
		} catch (RuntimeException rte) {
			System.out.println("in RTE");
		} catch (Exception e) {

		}

		System.out.println("Hello");
	}
}