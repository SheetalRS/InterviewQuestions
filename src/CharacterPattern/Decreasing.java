package CharacterPattern;

import java.util.Scanner;

public class Decreasing {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n= sc.nextInt();
		char c='E';
		for (int i = 1; i <= n; i++,c--) {
			char ch=c;
			
			for (int k = 1; k <i; k++) {
				System.out.print("  ");
				
			}
			for (int j = n; j >= i; j--) {
				
				System.out.print(ch-- + " ");
			
				
			}
			System.out.println();
		}

	}

}
