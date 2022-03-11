package forloop;
/*
a 
a b 
a b c 
a b c d 
 */
public class CharPat1 {

	public static void main(String[] args) {
		for (int i = 1;i < 5; i++) {
			char ch='a';
			for (int j = 1; j <=i; j++,ch++) {
				
					
					System.out.print(ch+" ");
				
			}
			System.out.println();
			
		}

	}

}
