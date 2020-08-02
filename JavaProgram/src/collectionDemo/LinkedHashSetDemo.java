package collectionDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo 
{
	public static void main(String[] args) 
	{
		Set<Integer> st = new LinkedHashSet<> ();
		st.add(54);
		System.out.println(st.add(45));
		st.add(32);
		st.add(76);
		System.out.println(st.add(45));
		System.out.println(st);
		
		///////
		for(Integer i:st)
		{
			System.out.print(i+"--");
		}
		//////
		System.out.println();
		Iterator<Integer> itr=st.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"**");
		}
	}
}