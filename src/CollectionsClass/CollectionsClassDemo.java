package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(80);
		al.add(100);
		al.add(90);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
