package test11;

import java.util.ArrayList;
import java.util.List;

public class MinMaxString2 {

	public static void main(String args[]) {

		List<String> stringList = new ArrayList<String>();

		stringList.add("Hyderabad");
		stringList.add("Bangalore");
		stringList.add("Delhi");
		stringList.add("Pune");
		stringList.add("ChennaiExpress");
		stringList.add("DelhiDaredeviles");

		minMaxLengthDelete(stringList);
	}

	private static void minMaxLengthDelete(List<String> stringList) {

		System.out.println("List before the min-max string delete " + stringList);

		int minlength = 1000000, maxlength = 0, minlengthindex = 0, maxlengthindex = 0, count = 0;

		for (String s : stringList) {

			if (minlength > s.length()) {

				minlength = s.length();
				minlengthindex = count;
			}

			if (maxlength < s.length()) {
				maxlength = s.length();
				maxlengthindex = count;
			}

			count++;
		}
		System.out.println("minlength index " + minlengthindex);
		System.out.println("maxlength index " + maxlengthindex);

		stringList.remove(minlengthindex);

		if (minlengthindex > maxlengthindex) {

			stringList.remove(maxlengthindex);
		}

		else {

			System.out.println("List after min max string delete" + stringList);
		}
	}
}
