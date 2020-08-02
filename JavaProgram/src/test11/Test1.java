package test11;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {

	public static void main(String args[]) {

		String[] str = new String[] { "Pune", "Mumbai", "100", "200","25874", "Delhi", "BACD21","Banglore" };

		printNumberAlphabateString(str);
	}

	private static void printNumberAlphabateString(String[] str) {
	  ArrayList<String> string = new ArrayList<>(Arrays.asList(str));
	  
	  int numberStringCount = 0;
	  int alphabteStringCount = 0;
	  for (String str1 : string )
	  {
		  if(str1 != null && str1.chars().allMatch(Character::isDigit))
		  {
			  //We can check whether the given character in a string is a number/letter by using isDigit() method of Character class
			  //isDigit() method is a static method and determines if the specified character is a digit or not 
			  
			  numberStringCount++;
			  
		  }else if  (str1 != null && str1.chars().allMatch(Character::isLetter))
	        {
			       alphabteStringCount++;  
			}
			  
			  
		  }
	  System.out.println("String with number in ArraySize" +"  "+ numberStringCount);
	  System.out.println("String with Alphabates in ArraySize " +"  "+ alphabteStringCount);
		  
	  }
}

