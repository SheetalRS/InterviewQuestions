package Assignmnts;

public class MinNumfromArr {

	public static void main(String[] args) {
		int[] x= {9,2,3,40,5,6,1,8};
		int min=x[0];
		for (int i : x) {
			if (min>i) {
				min=i;
			}
		}
		System.out.println(min);

	}

}
