package stringprograms;

class StringDemo {
	public static void main(String[] args) {
		String s = "I am learning Selenium";
		System.out.println(s.indexOf('e'));
		System.out.println(s.indexOf('e', 8));
		System.out.println(s.isEmpty());
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.length());
		System.out.println(s.replace('e', 'i'));
		System.out.println(s.replace("Selenium", "QTP"));
		String str = "g4h8n5n3&^%&^%b3424";
		System.out.println(str.replaceAll("[a-z0-9]", ""));
		System.out.println(s.startsWith("I am"));

		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 13));

		String str1 = "Total 0 results";
		System.out.println(str1.substring(6, str1.length() - 8));

		System.out.println(s.trim());

		String stp = "India|Ahmedabad|45";
		String[] stq = stp.split("[|]");
		System.out.println(stq[1]);

		stq = s.split("[ ]");
		System.out.println(stq.length);

		System.out.println(stq[3]);

		String orig = "malayalam";
		String rev = "";
		char[] ch = orig.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(orig);
		System.out.println(rev);

		if (orig.equals(rev)) {
			System.out.println("Pallindrome");
		} else {
			System.out.println("Not a Pallindrome");
		}

	}
}