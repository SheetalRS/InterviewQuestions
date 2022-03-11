package CollectionFramwork;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(0, 10);
		al.add(1, 20);
		al.add(2, 30);
		al.add(3, 40);
		al.add(4, 50);
		System.out.println(al);
		
		al.add(4, 45);
		System.out.println(al);
		System.out.println("-------------------");
		ArrayList ax=new ArrayList();
		ax.add(0, 11);
		ax.add(1, 22);
		ax.add(2, 33);
		ax.add(3, 44);
		ax.add(4, 55);
		
		System.out.println(ax);
		ax.addAll(2, al);
		System.out.println(ax);
		System.out.println("-------------------");
		
		
		ArrayList ar=new ArrayList();
		ar.addAll(al);
		System.out.println(ar);
		System.out.println(ar.get(3));
		System.out.println(ar.indexOf(45));
		
		ar.remove(4);
		System.out.println(ar);
		
		ar.add(5, 10);
		System.out.println(ar);
		System.out.println(ar.lastIndexOf(10));
		
		ar.set(2, 50);
		System.out.println(ar);
		List l =ar.subList(2, 5);
		System.out.println(l);
		
		
	
		
		
		
		
		
	}

}
