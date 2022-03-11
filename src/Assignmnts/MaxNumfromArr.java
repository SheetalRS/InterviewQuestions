package Assignmnts;

public class MaxNumfromArr {

	public static void main(String[] args) {
		int[] x= {1,2,3,40,5,6,7,8};
		int max=x[0];
		for (int i : x) {
			if (max<i) {
				max=i;
			}
		}
		System.out.println(max);

	}

}
