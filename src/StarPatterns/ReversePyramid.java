package StarPatterns;

import java.util.Iterator;
import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n= sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int space = n;
			for (int j = 1; j <= i; j++) {
				
				System.out.print(" ");
			}
			
			
			for (int k = n; k >=i ; k--) {
				System.out.print("* ");
				
			}
			
			System.out.println();
		}

	}

}
