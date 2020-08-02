package test11;

public class parseInt {

	public static void main(String args[]) {

		String s = "jintur";
		String s1 = "Parbhani";
		String s2 = "100";

		try {

			int i = Integer.parseInt(s.trim());
			System.out.println("int i = " + i);
		}

		catch (NumberFormatException nfe) {
			System.out.println("Number format Exception" + nfe.getMessage());

		}

	}

	// int i = Integer.parseInt(String);

}
