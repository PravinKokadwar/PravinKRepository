package test11;

import java.util.regex.*;

public class AplhanumericExample {

	public static void main(String args[]) {

		String s1 = "program345345mer";
		String s2 = "dgkdskgdfjkgh46895695";

		// System.out.println(s1.ma);

		System.out.println(s1.matches("[a-zA-Z0-9]+"));
		System.out.println(s2.matches("[a-zA-Z0-9]+"));

	}

}
