package LearnCollections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLearn {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(1);
		hs.add(5);
		hs.add(2);
		hs.add(10);
		hs.add("");
		hs.add(12);
		hs.add(5);
		
		
		System.out.println(hs);
		System.out.println("---------  Using Iterator ----------");
		Iterator it= hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
	}

}
