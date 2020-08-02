package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;
//import java.util.Vector;

public class ArrayListDemo 
{
	public static void main(String[] args) {
		ArrayList<String> li=new ArrayList<>();
		
		System.out.println(li.isEmpty());
		li.add("Sachin");
		li.add("Raina");
		li.add("Ajinkya");
		System.out.println(li);
		li.add(2, "Shikhar");
		System.out.println(li);
		System.out.println(li.contains("Sachin"));
		System.out.println(li.get(3));
		System.out.println(li.indexOf("Raina"));
		System.out.println(li.isEmpty());
		li.remove("Raina");
		System.out.println(li);
		System.out.println(li.set(0, "Dhoni"));;
		System.out.println(li);
		System.out.println(li.size());
		System.out.println(li.subList(1, 3));
		
	//////////////////////////
		System.out.println(li);
		//////////////////////
		
		for (int i = 0; i < li.size(); i++) {
			System.out.print(li.get(i)+" -- ");
		}
		////////
		System.out.println();
		
		for(String s:li)
		{
			System.out.print(s+"**");
		}
		////////
		System.out.println();
		
		Iterator<String> itr=li.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"--");
		}
		
	}
}