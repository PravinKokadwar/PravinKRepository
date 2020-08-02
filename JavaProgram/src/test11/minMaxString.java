package test11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class minMaxString {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();

		strList.add("Pune");
		strList.add("Mumbai");
		strList.add("Pen");
		strList.add("Banglore");
		strList.add("Kolkata");

		removeMinMaxString(strList);
	}

	static void removeMinMaxString(List<String> strList) {
		String minString = strList.get(0);
		String maxString = strList.get(0);

		System.out.println("Original List:" + strList);

		Iterator<String> itr = strList.iterator();

		while (itr.hasNext()) {
			String element = itr.next();
			if (element.length() < minString.length()) {
				minString = element;
			} else if (element.length() > maxString.length()) {
				maxString = element;
			}
		}
		strList.remove(minString);
		strList.remove(maxString);

		System.out.println("List after deleting min and max length string:" + strList);
	}

}
