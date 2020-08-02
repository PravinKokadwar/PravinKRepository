package test11;

public class StringProcessing {

	public static void main(String args[]) {

		String[] values = { "Pune", "3231", "Mumbai", "2342", "Delhi", "001", "Hyderabad" };

		countNumString(values);

	}

	private static void countNumString(String[] values) {
		int stringCount = 0, numCount = 0;
		for (String input : values) {
			try {
				Integer.parseInt(input);
				numCount++;
			} catch (Exception E) {

				stringCount++;
			}

		}

		System.out.println("Number of string present in Array" + "   " + stringCount);
		System.out.println("Numbers of Non-string present in Array" + "  " + numCount);

	}

}
