package StringDemo;
//Add digits from given string
public class AddDigits {

	public static void main(String[] args) {

		String s= "H3llo Te51in9 5hashtra";
		int result=0;
			for (int i = 0; i < s.length(); i++) {
				
				if (s.charAt(i)>='0' && s.charAt(i)<='9') {
					
					System.out.println(s.charAt(i)-48);
					
					result=result+(s.charAt(i)-48);
				}
			}
			System.out.println("--------");
			System.out.println(result);
		
		
	}

}
