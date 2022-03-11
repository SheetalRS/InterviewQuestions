package CollectionFramwork;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		
		System.out.println(al);
		al.add(5, 55);
		
		System.out.println(al);
		ArrayList ax= new ArrayList();
		
		ax.addAll(al);
		System.out.println(ax);
		
		ArrayList arr= new ArrayList();
		arr.add(11);
		arr.add(22);
		arr.add(33);
		System.out.println(arr);
		arr.addAll(2, ax);
		
		System.out.println(arr);
		
		System.out.println(arr.get(2));
		
		System.out.println(arr.indexOf(100));
		
		arr.remove(12);
		System.out.println(arr);
		
		arr.add(20);
		System.out.println(arr);
		
		System.out.println(arr.lastIndexOf(20));
		
		
		
	}

}
