package Assignmnts;

public class SecondMaxNumFromArr {

	public static void main(String[] args) {
		int[] x= {1,2,3,40,5,6,7,8};
		int max=x[0];
		int secondMax=x[0];
		for (int i : x) {
			if (max<i) {
				max=i;
			}
		}
		System.out.println(max);
		
		for (int j : x) {
			
			if (secondMax<j && j!=max) {
				
					secondMax=j;
				
				
			}
		}
		System.out.println(secondMax);

	}

}
