package Functions;

public class RevrsPyramid {

	public static void main(String[] args) {
		RevrsPyramid r= new RevrsPyramid();
		r.revPyramid(5,1);

	}
	
	public void revPyramid(int n,int t) {
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			if (t==1) {
				for (int j = i; j <= n; j++) {
					System.out.print("* ");
					
				}
				
			} else if(t==2) {
				int k=1;
				for (int j = i; j <= n; j++,k++) {
					System.out.print(k+" ");
					
				}
			}else if(t==3) {
				char ch='a';
				for (int j = i; j <= n; j++,ch++) {
					System.out.print(ch+" ");
					
				}
			}		
			
			
			System.out.println();
		}

	}

}
