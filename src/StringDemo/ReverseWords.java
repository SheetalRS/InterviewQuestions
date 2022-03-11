package StringDemo;

public class ReverseWords {

	public static void main(String[] args) {
		String s="hello testing shashtra";
		 s=s+" ";
		 int p=0;
		String result="";
		for (int i = 0; i < s.length(); ) {
			p=s.indexOf(" ");
			
			
			System.out.println(p);
			//System.out.println(s);
			for (int j = p-1; j >=i; j--) {
				System.out.print(s.charAt(j));
				
				
			}
			s=s.substring(p+1);
			i=0;
			System.out.println();
			
			
		}

	}

}
