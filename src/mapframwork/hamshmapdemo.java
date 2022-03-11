package mapframwork;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class hamshmapdemo {

	public static void main(String[] args) {
		HashMap hm= new HashMap();
		hm.put(10, "Maharashtra");
		hm.put(11, "Madhya Pradesh");
		hm.put(12, "Uttar Pradesh");
		hm.put(13, "Uttarakhand");
		hm.put(14, "Punjab");
		hm.put(15, "Haryana");
		
		hm.put(15, "Tamilnadu");
		hm.putIfAbsent(16, "Karnataka");
		
		System.out.println(hm);
		
		System.out.println("----Print Values using values() method----");
		 Collection values = hm.values();
		 Iterator it=values.iterator();
		 while (it.hasNext()) {
			System.out.println(it.next());
		}
		 
		 System.out.println("----Print Values using keySet() method----");
		 
		  Set s= hm.keySet();
		  Iterator itr=	s.iterator();
		  while (itr.hasNext()) {
			  Object o=itr.next();
			 System.out.println(o +" " + hm.get(o));
			
		}
		  
		  System.out.println("----Print Values using entrySet() method----");
		  	Set entries = hm.entrySet();
		  	
		  	 Iterator itra=	entries.iterator();
		  	 while (itra.hasNext()) {
		  		Map.Entry entry= (Entry) itra.next();
		  		System.out.println(entry.getKey() + " " + entry.getValue());
			}
		  
	}

}
