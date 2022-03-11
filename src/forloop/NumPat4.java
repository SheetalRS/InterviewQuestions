package forloop;
/*
1 
a b 
1 2 3 
a b c d 
 */
public class NumPat4 {

	public static void main(String[] args) {
		for (int i = 1;i < 5; i++) {
			char ch='a';
			for (int j = 1; j <=i; j++,ch++) {
				if (i%2==0) {
					
					System.out.print(ch+" ");
				} else {
					System.out.print(j +" ");
				}
			}
			System.out.println();
			
		}

	}

}
