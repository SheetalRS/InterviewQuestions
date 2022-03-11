package CollectionFramwork;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListItratorDemo {

	public static void main(String[] args) {
		ArrayList ar= new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(70);
		ar.add(80);
		ar.add(90);
		ar.add(100);
		
		ListIterator litr=ar.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
			
		}
		
		System.out.println("-------------------------");
		while (litr.hasPrevious()){
			System.out.println(litr.previous());
			
		}
		
		System.out.println("-------------------------");
		
		ListIterator ltr=ar.listIterator(ar.size());
		while (ltr.hasPrevious()) {
			System.out.println(ltr.previous());
			
		}
	}

}
