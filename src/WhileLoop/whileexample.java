package WhileLoop;

public class whileexample {

	public static void main(String[] args) {
		int[] x= {11,12,13,14,15,16,17,18};
		int i=0;
		while (i<x.length) {
			if ((x[i]%2==0)){
				System.out.println(x[i]);
			}
			
			i++;
		}
	}

}
