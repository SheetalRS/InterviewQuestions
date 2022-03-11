package StarPatterns;

import java.util.Scanner;

public class Butterfly {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
			System.out.println(n);
			int space= n;
			
			
			  for (int i = 1; i <=n; i++) {
			  
			  for (int j = 1; j <=i; j++) { System.out.print("* ");
			  
			  } for (int k = ((space*2)-2); k >=1; k--) { System.out.print("  ");
			  
			  }
			  
			  for (int l = 1; l <=i; l++) { System.out.print("* ");
			  
			  } System.out.println(); space--;
			  
			  
			  }
			 
			
			
			
			  for (int i = 1; i <n; i++) {
			  
			  
			  
			  for (int l = n; l >i; l--) {
				  System.out.print("* ");
			  
			  }
			  
			  for (int m = (i)*2; m>=1; m--) { 
				  System.out.print("  ");
			  
			  }
			  
			  for (int p = n; p >i; p--) { 
				  System.out.print("* ");
			  
			  }
			  
			  System.out.println();
			  
			  
			  }
			 
			
		

	}

}
