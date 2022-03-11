package JavaGenerics;

import java.util.Iterator;

public class AddNumbersfromString {

	public static void main(String[] args) {
		String s= "He110 Testing 5ha57ra";
		int result=0;
	for (int i = 0; i < s.length(); i++) {
		if (Character.isDigit(s.charAt(i))) {
			result=result+Character.getNumericValue(s.charAt(i));
		}
	}
		
		System.out.println(result);
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.println(s.charAt(i));
			}
		}
	}
	
	

}
