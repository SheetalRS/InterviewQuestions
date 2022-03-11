package JavaGenerics;

import java.util.ArrayList;

public class Generics2 {

	public static void main(String[] args) {
		int m=10;
		ArrayList ar= new ArrayList();
		ar.add(m);  //l is object here--converted to object internally
		System.out.println(ar);
		
	//	int r=ar.get(0)+5; // gives compile time error as cant add object and int
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(m); //new Integer(m) 
		
		int r=al.get(0)+5;
		System.out.println(r);

	}

}
