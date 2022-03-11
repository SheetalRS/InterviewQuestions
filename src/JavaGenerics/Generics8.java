package JavaGenerics;
//Print only upper case character
public class Generics8 {

	public static void main(String[] args) {
		String s="i Love mY indiA";
		
		for (char ch : s.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				System.out.println(ch);
			}
		
		}
		
	}

}
