package CollectionFramwork.SetCollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import java.util.TreeSet;

public class FindSecondHightestElement {

	public static void main(String[] args) {
		
		Integer[] arr= {21,12,9,19,19,11,21,7,21};
		
		 
		TreeSet ts= new TreeSet<>();
	
		for (int i = 0; i < arr.length; i++) {
			ts.add(arr[i]);
		}
		
		System.out.println(ts);
		System.out.println(ts.first());
		
		System.out.println(ts.last());
		System.out.println(ts.lower(ts.last()));
		
		
		System.out.println("----Other Way------");
		List<Integer> al= Arrays.asList(arr);
		TreeSet t= new TreeSet<>(al);
		System.out.println(t);
		System.out.println(t.headSet(t.last()).last());
		
		
		
		 
		 
		
		
		
		
		
		
	}

	private static char[] headset(Object last) {
		// TODO Auto-generated method stub
		return null;
	}

}
