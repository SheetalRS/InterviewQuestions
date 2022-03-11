package StringDemo;
//  == is used to comared address
// string created using literal stoared in string constant pool.
//string constant pool dont allow dupliactes so.. s and t point to same memory location

// string created using string object stored in Heap
//Heap can have duplicate data. so two strings created p and q having diff address
public class StringDemo1 {

	public static void main(String[] args) {
		//1. String litral
		
				String s="Hello";
				String t="Hello";
				
				if (s==t) {
					System.out.println("Match");
				} else {
					System.out.println("Mis Match");
				}
				
		
		//2 using object
				String p= new String("Hello");
				String q= new String("Hello");
				if (p==q) {
					System.out.println("Match");
				} else {
					System.out.println("Mis Match");
				}

	}

}
