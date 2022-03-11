package CharacterPattern;

import java.util.Scanner;

public class DecreasingAlpha {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n= sc.nextInt();
		char c='E';
		for (int i = 1; i <= n; i++,c--) {
			
			
			for (int k = 1; k <i; k++) {
				System.out.print("  ");
				
			}
			for (int j = n; j >= i; j--) {
				
				System.out.print(c + " ");
			
				
			}
			System.out.println();
		}

	}

}
