package Functions;

import java.util.Scanner;

public class Function1 {

	public static void main(String[] args) {
		Function1 f = new Function1();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter " + size + " numbers");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int sum = f.add(arr);
		System.out.println("Sum of Elements " + sum);

		System.out.println("Enter String ");
		String str = sc.next();

		for (int i = 0; i < str.length(); i++) {

			if (f.isDigit(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}

		}

	}

	public int add(int[] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		return sum;
	}

	public boolean isDigit(char c) {
		boolean isDigit = false;
		if (c >= 48 && c <= 57) {

			isDigit = true;
		}

		return isDigit;

	}

}
