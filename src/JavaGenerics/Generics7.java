package JavaGenerics;

public class Generics7 {

	public static void main(String[] args) {
		String s="i love india";
		String temp="";
		String[] words =s.split(" ");
		
		for (String str : words) {
			if (Character.isLowerCase(str.charAt(0))) {
				
				str=new String(Character.toUpperCase(str.charAt(0))+str.substring(1));
				
				System.out.print(str + " ");
				
			}
			
			
		}
		

	}

}
