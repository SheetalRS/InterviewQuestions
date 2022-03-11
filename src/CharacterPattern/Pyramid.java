package CharacterPattern;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int inc=0;
		for (int i = 1; i <=n; i++) {
			
			  for (int k = n; k >i; k--) {
				  System.out.print("  ");
			  
			  }
			
			 
			
			for (int j = 1; j <= i+inc; j++) {
				if(i%2==0) {
					System.out.print("# ");
				}else {
					System.out.print("A ");
				}
			}
			
			System.out.println();
			inc++;
		}

	}

}
