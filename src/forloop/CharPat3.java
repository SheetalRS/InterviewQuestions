package forloop;

public class CharPat3 {

	public static void main(String[] args) {
		char ch='a';
		for (int i = 1;i < 5; i++,ch++) {
			
			for (int j = 1; j <=i; j++) {
				
					System.out.print(ch +" ");
			
			}
			System.out.println();
			
		}

	}

}