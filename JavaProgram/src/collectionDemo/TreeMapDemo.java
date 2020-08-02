package collectionDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> mp=new TreeMap<>();
		mp.put(57, "India");
		mp.put(68, "Nepal");
		mp.put(43, "Bhutan");
		mp.put(19, "Sri Lanka");
		mp.put(19, "Myanmar");
		
		System.out.println(mp);
		
		System.out.println(mp.containsKey(43));
		System.out.println(mp.containsValue("Nepal"));
		System.out.println(mp.get(43));
		
		//mp.remove(19);
		System.out.println(mp);
		
		mp.replace(43, "China");
		System.out.println(mp);
		
		Set<Integer> st=mp.keySet();
		
		Iterator<Integer> itr=st.iterator();
		
		while(itr.hasNext())
		{
			Integer key=itr.next();
			System.out.println(key+"-"+mp.get(key));
		}
		

	}
}