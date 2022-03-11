package Assignmnts;
//Complexity n(n+1)
public class PrimNumFrmArr {

	public static void main(String[] args) {
		int[] x= {9,2,3,40,5,6,1,8};
		int min=x[0];
		for (int i : x) {
			int count=0;
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					count++;
				}
				
			}
			if (count<=2) {
				System.out.println(i);
			}
		}
		

	}

}
