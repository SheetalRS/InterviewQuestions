package ArrayExamples;

public class CopyArray {

	public static void main(String[] args) {
		int[] a= {1,7,3,8,2,9};
		int[]b=new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
		}

	}

}
