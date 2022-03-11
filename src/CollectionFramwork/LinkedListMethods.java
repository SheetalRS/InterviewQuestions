package CollectionFramwork;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		
		l.add(20);
		l.add("Hello");
		l.add('A');
		l.add(true);
		l.add(50.5f);
		System.out.println(l);
		
		l.addFirst(10);
		l.addLast(60);
		
		System.out.println(l);
		
		System.out.println(l.element());
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		
		l.offer(70);
		System.out.println(l);
		
		l.offerFirst(100);
		System.out.println(l);
		
		l.offerLast(90);
		System.out.println(l);
		
		System.out.println(l.peek());
		
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		System.out.println(l);
		l.poll();
		System.out.println(l);
		l.pollFirst();
		System.out.println(l);
		l.pollLast();
		System.out.println(l);
		
		l.pop();
		System.out.println(l);
		
		l.push("Hello");
		
		System.out.println(l);
		
		l.addLast("Hello");
		System.out.println(l);
		l.removeLastOccurrence("Hello");
		System.out.println(l);
		
		
	
		
		
		
		
		

	}

}
