package forloop;

public class charnumberpyramid {

	public static void main(String[] args) {
		
		boolean alpha=true;
		char lastchar='a';
		for (int i = 1; i <= 4; i++) {
			
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
				
			}
			
			if (alpha) {
				
				for (char k = 'a'; k <= lastchar; k++) {
					
					System.out.print(k + " ");
					
				}
				lastchar+=2;
				alpha=false;	
				
			} else {
				for (int l = 1; l <= i; l++) {
					System.out.print(l+" ");
					
				}
				alpha=true;
			}
			
		System.out.println();	
		}
	}

}
