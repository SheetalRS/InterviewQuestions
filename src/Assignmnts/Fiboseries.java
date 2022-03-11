package Assignmnts;

public class Fiboseries {

	public static void main(String[] args) {
		
		int n=8;
		int sum=0,sum1=1;
		for (int i = 0; i <=n; i++) {
			if (i==0) {
				System.out.println(sum);
			}else if (i==1) {
				System.out.println(sum1);
			}else {
				sum=sum+sum1;
				System.out.println(sum);
				int temp=sum1;
				sum1=sum;
				sum=temp;
				
				
			}
			
			
			
		}

	}

}
