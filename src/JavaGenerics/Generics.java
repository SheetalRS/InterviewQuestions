package JavaGenerics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		int result=0;
		Iterator<Integer>itr= al.iterator();
		
		while (itr.hasNext()) {
			result=result+itr.next();
			
			
		}
		
		System.out.println(result);
	}

}
