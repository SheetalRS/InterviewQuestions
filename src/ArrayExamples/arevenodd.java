package ArrayExamples;

public class arevenodd {

	public static void main(String[] args) {
		int[] a= {1,7,2,8,3,9,4,5};
		
		int counteven=0,countodd=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				counteven++;
		
			} else {
				countodd++;
			}
			
		}
	
		int []b=new int[counteven];
		
		
		
		int  k = 0;
		
		for (int j = 0; j < a.length; j++) {
			
			if (a[j]%2==0) {
				b[k]=a[j];
				k++;
				
				
			}
			
		}
				
		for (int l = 0; l < b.length; l++) {
			System.out.println(b[l]);
			
		}
		System.out.println("---------------------");
		
		
		
		
	}

}
