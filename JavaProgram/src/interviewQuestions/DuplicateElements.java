package interviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String args[]) {

		String names[] = { "Java", "Python", "Ruby","Pearl", "Java", "Javascript" };

		//1.Compare each elements ony-by-one 
		
		/*for (int i = 0; i <= names.length; i++) {

			for (int j = i + 1; j <= names.length; j++) {
				if (names[i].equals(names[j])) {

					System.out.println("The Duplicate elements is :: " + names[i]);
				}

			}
		}
		System.out.println("****************************");*/ 

        // 2.Using HashSet: Java Collection as it stores unique values

         Set<String> store = new HashSet<String>();
             for(String name:names) {
            	 if(store.add(name)== false) {
            		 
            		 System.out.println("Duplicate Element is ::"+ name);
            	 }
            	 
             }  
             
             System.out.println("****************************");
             
	}    
	
}
             
