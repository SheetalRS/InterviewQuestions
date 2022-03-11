package StringDemo;

public class Test {

	public static void main(String[] args) {
		//declaring String
		
		//1. String litral
		
		String s="Hello";
		s=s+" Testing Shashtra";
		System.out.println(s);
		s=s.concat(" How are you?");
		System.out.println(s);
		s.concat("Today");
		System.out.println(s);//when string is concantinated it should be received in variable
		
		System.out.println("  -----  Using Object-----    ");
		//2 using object
		String t= new String("Hello");
		t=t+" Testing Shashtra";
		System.out.println(t);
		t=t.concat(" How are you?");
		System.out.println(t);
		
	}

}
