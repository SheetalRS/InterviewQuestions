package Assignmnts;
//Complexity 2n
import java.util.Scanner;

public class PrimeNumNew {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		System.out.println("Enter "+ size + " Numbers");
		int[] x= new int[size];
		for (int i = 0; i < size; i++) {
			x[i]=sc.nextInt();
			
		}
		System.out.println("Prime Numbers are");
		for (int j : x) {
			if (j%2==0||j%3==0||j%5==0||j%7==0) {
				if (j==2||j==3||j==5||j==7) {
					System.out.println(j);
				}
				
			} else {
				System.out.println(j);
			}
		}
	}

}
