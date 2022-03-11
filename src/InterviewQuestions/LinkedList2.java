package InterviewQuestions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//pair Wise swwap elements
public class LinkedList2 {

	public static void main(String[] args) {
		Integer tmp = null,tmp1 = null;
		LinkedList<Integer> l= new LinkedList();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		
		System.out.println(l);
		
		ListIterator<Integer> ltr=l.listIterator();
		
		while (ltr.hasNext()) {
			tmp=ltr.next();
			System.out.println("tmp "+tmp);
			if (ltr.hasNext()) {
				
				tmp1=ltr.next();
				System.out.println("tmp1 "+tmp1);
				System.out.println("Setting tmp");
				ltr.set(tmp);
				System.out.println(tmp);
				if (ltr.hasPrevious()) {
					ltr.previous();
					
					if (ltr.hasPrevious()) {
						ltr.previous();
					}
						System.out.println("Setting tmp1");
						ltr.set(tmp1);
						System.out.println(tmp1);
					
					
				}
			
				if (ltr.hasNext() ) {
					ltr.next();
					if (ltr.hasNext()) {
						ltr.next();
					}
				}
			}else {
				
			}
			System.out.println("tmp "+tmp);
			System.out.println("tmp1 "+tmp1);
			
		}
		
		
		System.out.println();
		System.out.println(l);
	}

}
