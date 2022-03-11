package LearnCollections;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Spliterator;

import javax.lang.model.element.Element;

public class HashmapLearn {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(1, "Hello");
		hm.put(2, "Testing");
		hm.put(3, "Shastra");
		
		System.out.println(hm);
		
		Set keys=hm.keySet();
		Iterator it= keys.iterator();
		while (it.hasNext()) {
			System.out.println(hm.get(it.next()));
			
		}
		
		Set entryset=hm.entrySet();
		
		Iterator eit=entryset.iterator();
	
		while (eit.hasNext()) {
				Map.Entry<Integer, String> entry=(Entry<Integer, String>) eit.next();
				//System.out.println(entry.getKey());
				System.out.println(entry.getValue());
				
				
			
			
		}
		
		

	}

}
