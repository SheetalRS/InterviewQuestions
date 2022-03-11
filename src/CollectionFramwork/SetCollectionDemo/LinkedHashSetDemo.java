package CollectionFramwork.SetCollectionDemo;

import java.util.LinkedHashSet;

//growable
//insrtion order maintained
//duplicates are not allowed
//initial capacity is 16 and load factor is 0.75
////backend data str is HashTable and doubly linked list
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		 LinkedHashSet lhs= new  LinkedHashSet();
		 
		 lhs.add(10);
		 lhs.add(20);
		 lhs.add(30);
		 lhs.add(100);
		 lhs.add(70);
		 lhs.add(50);
		 lhs.add(40);
		 lhs.add(60);
		 lhs.add(80);
		 lhs.add(90);
		 System.out.println(lhs);
		 
		
	}

}
