package CollectionFramwork;

import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(10);
		v.add("Hello");
		v.add('A');
		v.add(10.5f);
		v.add(true);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(50);
		v.add(60);
		
		System.out.println("-------for loop-----------");
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
			
		}
		
		System.out.println("-----for each--------------");
		for (Object obj : v) {
			System.out.println((int)obj);
		}
		
		
		
		Enumeration e=v.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}

	}

}
