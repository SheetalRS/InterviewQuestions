package CollectionFramwork;

import java.util.Vector;

public class VectorDemo {

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
		System.out.println(v);
		System.out.println(v.capacity());
		v.add(70);
		System.out.println(v);
		System.out.println("capacity "+v.capacity()); //when element added more than initial capacity..new capacity bcomes double of original
		System.out.println("size "+v.size());
		
		
		System.out.println(v.elementAt(2));
		
		Vector vr=new Vector(10,5);
		System.out.println("capacity "+vr.capacity());
		
		vr.add(11);
		vr.add("Hello");
		vr.add('A');
		vr.add(11.5f);
		vr.add(true);
		vr.add(22);
		vr.add(33);
		vr.add(44);
		vr.add(55);
		vr.add(66);
		
		System.out.println(vr);
		
		System.out.println("capacity "+vr.capacity());
		vr.add(77);
		System.out.println("capacity "+vr.capacity());
		
		System.out.println(vr.contains(22));
		
		System.out.println(vr.containsAll(v));
		
		System.out.println(vr.firstElement());
		System.out.println(vr.get(1));
		
		System.out.println(vr);
		
		System.out.println(vr.lastElement());
		
		vr.remove(1);
		System.out.println(vr);
		
		vr.removeAllElements();
		System.out.println(vr);
		
		

	}

}
