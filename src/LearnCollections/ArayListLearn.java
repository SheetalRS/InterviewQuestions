package LearnCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArayListLearn {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(1);
		al.add(5);
		al.add(2);
		al.add(10);
		al.add("");
		al.add(12);
		al.add(5);
		al.add("Hello");
		System.out.println(al);
		
		System.out.println("***** Using for loop *****");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("***** Using iterator *****");
		Iterator it= al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("***** Using Listiterator *****");
		ListIterator litr= al.listIterator();
		
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		System.out.println("***** Reverse Using Listiterator *****");
		
		while(litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		
	}

}
