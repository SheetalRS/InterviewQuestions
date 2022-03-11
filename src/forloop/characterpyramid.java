package forloop;

public class characterpyramid {

	public static void main(String[] args) {
		
			
			for (char i = 'a';i <='d'; i++) {
				
				for (char j ='d'; j>=i; j--) {
					System.out.print(" ");
					
				}
				
				for (char k = 'a'; k <=i; k++) {
					System.out.print(k + " ");
				}
			
				System.out.println();
			}
			
			
		
			
		}

	}


