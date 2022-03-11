package CharacterPattern;

import java.util.Scanner;

public class SandGlass {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		char ch='A';
		int inc=n-1;
		for (int i = n; i >= 1; i--,ch++) {
			for (int space = n; space >i; space--) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i+inc ; j++) {
				System.out.print(ch+" ");
				
			}
			System.out.println();
			inc--;		
			}
		ch--;
		for (int i = 1; i <= n; i++) {
			ch--;
			for (int space = n; space >i; space--) {
				System.out.print("  ");
			}
			for (int j = 1; j <=i+inc ; j++) {
				System.out.print(ch+" ");
				
			}
			System.out.println();
			inc--;		
			}

	}

}
