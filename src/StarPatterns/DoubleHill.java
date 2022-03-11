package StarPatterns;

import java.util.Scanner;

public class DoubleHill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		
		 for (int i = 1; i <= n; i++) {
			 
				
				  for (int j = n; j > i; j--) {
					  System.out.print(" ");
				  
				  }
				  
				  for (int k = 1; k <= i; k++) { 
					  System.out.print("* ");
				  
				  }
				 
			  
			  
			  for (int l = n; l > i; l--) { 
				
				  System.out.print(" ");
			  
			  }
			  
			  for (int p = n; p > i; p--) { 
					
				  System.out.print(" ");
			  
			  }
			  
			  for (int m = 1; m <=i; m++) { 
				
				  System.out.print("* ");
			  
			  }
			  
			  System.out.println();
			  
			  }
		 

	}

}
