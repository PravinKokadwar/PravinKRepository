package collectionDemo;

//import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set<String> st=new TreeSet<>();
		st.add("Rohan");
		System.out.println(st.add("Mohan"));
		st.add("Sohan");
		st.add("Dohan");
		System.out.println(st.add("Mohan"));
		System.out.println(st);
		
		///////
		for(String i:st)
		{
			System.out.print(i+"--");
		}
		//////
		System.out.println();
		Iterator<String> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"**");
		}
		System.out.println();
		System.out.println(st.size());
	}
}