package StringDemo;

public class ConverttoTiltleCase {

	public static void main(String[] args) {
		String s="hello testing shashtra";
		String result="";
		System.out.println(s);
		
		
			char firstChar=s.charAt(0);
			if (Character.isLowerCase(firstChar)) {
				result=result+Character.toUpperCase(firstChar);
			}
			
		for (int i = 1; i < s.length(); i++) {
			char cureChar=s.charAt(i);
			char prevChar=s.charAt(i-1);
			if (prevChar==' ' && Character.isLowerCase(cureChar)) {
				result=result+Character.toUpperCase(cureChar);
			}else {
				result=result+s.charAt(i);
			}
			
		}
	
		System.out.println(result);
			
	}

}
