package Assignmnts;

import java.util.Scanner;

public class SecondMaxNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		System.out.println("Enter "+ size + " Numbers");
		int[] x= new int[size];
		for (int i = 0; i < size; i++) {
			x[i]=sc.nextInt();
			
		}
		
		for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {
				if (x[i]>x[j]) {
					int tmp=x[i];
					x[i]=x[j];
					x[j]=tmp;
				}
				
			}
			
		}
		System.out.println("Ascnding array ");
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			
		}
		
		System.out.println("Second Max Number ");
		
		int j=x.length-1;
		while (x[j]==x[j-1]) {
			j--;
		}
		System.out.println(x[j-1]);
		
	}

}
