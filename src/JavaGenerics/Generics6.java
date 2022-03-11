package JavaGenerics;

public class Generics6 {

	public static void main(String[] args) {
		String s= "He110 D33pak7";
		int result=0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				result=result+Character.getNumericValue(s.charAt(i));
			} 
		
			
		}
		System.out.println(result);
		int r=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>'0'&& s.charAt(i)<='9') {
				r=r+s.charAt(i)-48;
			} 
			
		}
		
		System.out.println(r);
		
		String c="100";
		int i= Integer.valueOf(c);
		System.out.println(i +5);
		int sum=0;
		String temp="";
		
		
		for (int j = 0; j < s.length(); j++) {
			if (Character.isDigit(s.charAt(j))) {
				temp+=s.charAt(j);
				if (j==s.length()-1) {
					System.out.println(temp);
					sum=sum+Integer.valueOf(temp);
					
				}
			} 
			else {
				System.out.println(temp);
				if (!temp.isBlank()) {
					sum=sum+Integer.valueOf(temp);
					
				}
				
				temp="";
			}
			
		}
			
	
		System.out.println(sum);
		
		
		
	}

}
