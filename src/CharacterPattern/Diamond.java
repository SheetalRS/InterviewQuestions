package CharacterPattern;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		char c='A';
		int inc =0;
		for (int i = 1; i <= n; i++,inc++) {
			
			for (int k = n; k >i; k--) {
				System.out.print("  ");
				
			}
			
			for (int j = 1; j <= i+inc; j++) {
				System.out.print(c + " ");
				
			}
			System.out.println();
			c++;
		}
	
		--inc;
		for (int i = 1; i <n; i++) {
			inc--;
			
			for (int k = 1; k <=i; k++) {
				System.out.print("  ");
				
			}
			
			for (int j = n-1+inc; j >= i; j--) {
				System.out.print(c + " ");
				
			}
			System.out.println();
			c++;
		}

	}

}
