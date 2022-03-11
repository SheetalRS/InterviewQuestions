package forloop;

public class ChatPat2 {

	public static void main(String[] args) {
		
		for (int i = 1;i < 5; i++) {
			char ch='a';
			
			for (int j = 1; j <=i; j++,ch++
					) {
				if (i==1||i==4) {
					System.out.print(j+" ");
				} else if(i==2||j==5) {
					System.out.print(ch+" ");
				}else if(i==3||j==6) {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
			
		}

	}

}
