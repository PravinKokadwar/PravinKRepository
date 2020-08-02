package collectionDemo;

import java.util.*;

public class ArrayListMethods 
{
	public static void main(String[] args){
		ArrayList<String> li = new ArrayList<>();
		
		li.add("One");
		li.add("Two");
		li.add("Three");
		li.add("Four");
		li.add("Five");
		li.add("Six");
		li.add("Seven");
		
		System.out.println(li);
		
		System.out.println();
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		System.out.println();
		for (String string : li) {
			System.out.println(string);
		}
		 
	}

}