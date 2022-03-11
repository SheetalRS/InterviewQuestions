package CharacterPattern;

import java.util.Scanner;

public class RightIncreasing {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n= sc.nextInt();
		
		for (int i = 1 ; i <= n; i++) {
			char k = 'A';
			for (int j = 1; j <= i; j++) {
				if (i%2==0) {
					System.out.print("B ");
				} else if(i%2!=0) {
					System.out.print("A ");
				}
				
				
			}
			for (int l = n; l > i; l--) {
				System.out.print("  ");
				
			}
			
			for (int m = n; m > i; m--) {
				System.out.print("  ");
				
			}
			for (int p = 1; p <= i; p++) {
				
				System.out.print(k++ + " ");
			
		}
			System.out.println();
	}

}
}