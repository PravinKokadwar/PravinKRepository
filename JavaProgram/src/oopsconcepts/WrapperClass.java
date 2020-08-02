package oopsconcepts;

public class WrapperClass {

	public static void main(String args[]) {

		String x = "100";
		System.out.println(x + 20);

		// Data conversion : String to Int

		int i = Integer.parseInt(x);
		System.out.println(i + 20);

		// Integer,Double, Character, Boolean

		// String to double conversion
		String y = "25.55";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);

		// String to boolean conversion
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);

		// int to string conversion
		int j = 200;
		System.out.println(j + 20);

		String s = String.valueOf(j);
		System.out.println(s + 20);

		String u = "1000A";
		Integer.parseInt(u); // NumberFormatException -- for input string - 1000A

	}

}
