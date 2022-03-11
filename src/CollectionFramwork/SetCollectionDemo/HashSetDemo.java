package CollectionFramwork.SetCollectionDemo;

import java.util.Collection;

//growable

//value can be homo/heterogneous
//value is stoard as key in backend 
//values cant be duplicate
//one null is allowed
//insertion order is not guaranteed.

//initial capacity is 16 and load factor is 0.75
//constrctors are
//HashSet()
//public HashSet(Collection c)
//HashSet(int initialCapacity)
//HashSet(int initialCapacity, float loadFactor) 
//backend data str is HashTable

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		hs.add(10);
		hs.add(50);
		hs.add(30);
		hs.add(20);
		hs.add(40);
		hs.add(100);
		hs.add(60);
		hs.add(null);
		hs.add("Hello");
		System.out.println(hs);
		
		
	}

}
