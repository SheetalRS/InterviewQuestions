package CollectionFramwork;

import java.util.ArrayList;

public class CollectionsMethods {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		System.out.println(al.isEmpty());
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add("Hello");
		al.add('A');
		al.add(true);
		al.add(50.5f);
		al.add(null);
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println(al.isEmpty());
		System.out.println("Size is "+al.size());
		System.out.println(al);
		
		ArrayList ax= new ArrayList();
		ax.add(11);
		ax.add(22);
		ax.add(33);
		
		System.out.println(ax);
		ax.addAll(al);
		
		System.out.println(ax);
		
		System.out.println(ax.containsAll(al));
		System.out.println(al.contains('A'));
		
		
		ax.removeAll(al);
		System.out.println(ax);
		
		System.out.println(ax.containsAll(al));
		
		ax.addAll(al);
		System.out.println(ax);
		System.out.println(ax.retainAll(al));
		
		System.out.println(ax);
		ax.remove(2);
		System.out.println(ax);
		
		Object[] obj=ax.toArray();
		for (Object object : obj) {
			System.out.print(object + "\t");
		}
	
		
		
	}

}
