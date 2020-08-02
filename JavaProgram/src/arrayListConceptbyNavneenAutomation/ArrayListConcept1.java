package arrayListConceptbyNavneenAutomation;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ArrayListConcept1 {

	public static <E> void main(String args[]) {

		int a[] = new int[3]; // This is Static array -- size is fixed

		// Dynamic Array -- Sie is not fixed-- ArrayList
		// 1.ArrayList contains duplicate values/elements
		// 2.maintains insertion order
		// 3.Synchronized
		// allow random access to fetch the elements because it stores values on the
		// basis of indexes.

		ArrayList ar = new ArrayList();
		ar.add(10); // 0th position
		ar.add(20); // 1st position
		ar.add(30); // 2nd position

		System.out.println(ar.size());

		ar.add(40); // 3rd position
		ar.add(50); // 4th position
		ar.add(12.33);
		ar.add("Test");
		ar.add(true);

		System.out.println(ar.get(7)); // will give the 4th position element

		System.out.println(ar.size());
		// need to print all values from arraylist 1)for loop 2)iterator
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}

		// non generic Vs generic

		ArrayList<Integer> ar1 = new ArrayList<Integer>(); // generic is Integer
		ar1.add(200);
		ar1.add(300);
		ar1.add(4000);

		ArrayList<String> ar2 = new ArrayList<String>(); // here generic is String
		ar2.add("PUNE");
		ar2.add("MUMBAI");
		ar2.add("Banglore");

		// When we don't know the exact return type of values of element, we write E
		ArrayList<E> ar3 = new ArrayList<E>();

		// Employee class objects
		Employee em3 = new Employee("Pravin", 25, "CSE");
		Employee em4 = new Employee("Navneen", 20, "CSE");
		Employee em5 = new Employee("Mukesh", 23, "CSE");

		// Create ArrayList
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(em3);
		al.add(em4);
		al.add(em5);

		// Iterator to traverse the values
		Iterator<Employee> it = al.iterator();
		while (it.hasNext()) {

			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}

		// addAll() method is used to add two arrays
		// removeAll() method is used to remove all parameters from two arrayList
        // retainAll() method is used to retain all common parameters from both the arrayList

		ArrayList<Integer> ar5 = new ArrayList<Integer>(); // generic is Integer
		ar5.add(1458);
		ar5.add(5468);
		ar5.add(5544);

		System.out.println("===============================");
		
		ArrayList<Integer> ar6 = new ArrayList<Integer>(); // generic is Integer
		ar6.add(6547);
		ar6.add(7894);
		ar6.add(9966);

		ar5.addAll(ar6);
		for(int i=0;i<ar5.size();i++) {
			
			System.out.println(ar5.get(i));

			
		}
		System.out.println("==============================");

	}

}
