package CollectionFramwork.SetCollectionDemo;

import java.util.Hashtable;

//hash table is data structure.java implemented it in hashtable class
//growable
//stoares data in key value pair
//key and value can be homo/heterogneous
//key is unique
//values can be duplicate
//key should not be null
//value should not be null
//insertion order is not guaranteed.
//key and value pair is called entry.
//initial capacity is 11 and load factor is 0.75

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable ht= new Hashtable();
		ht.put(9, "ABC");
		ht.put(19, "Sachin");
		ht.put(29, "Mahi");
		ht.put(39, "Pruthvi");
		ht.put(49, "Shikhar");
		ht.put(59, "Virat");
		ht.put(69, "Ashwin");
		ht.put(26, "Rohit");
		
		System.out.println(ht);
		
		ht.put(79, "Saurav");
		ht.put(89, "Hardik");
		System.out.println(ht);
		
		System.out.println(ht.get(9));
		ht.put(20, "Hello");
		System.out.println(ht);
		
	}

}
