package CollectionFramwork.SetCollectionDemo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

//print second largest number
public class HashSetDemo1 {

	public static void main(String[] args) {
		Integer[] x= {1,9,20,50,8,2,100,5,23,68,9,50};
		
		HashSet hs= new HashSet(Arrays.asList(x));
		System.out.println(hs);
		x=new Integer[hs.size()];
		hs.toArray(x);
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] +"\t");
			
		}
		System.out.println();
		System.out.println(x[x.length-2]);
		
		
			
	

	}

}
