package CollectionFramwork;

import java.util.ArrayList;
import java.util.Iterator;

public class ItratorDemo {

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
		
		Iterator it=ar.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

	}

}
