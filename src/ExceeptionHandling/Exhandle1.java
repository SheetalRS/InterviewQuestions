package ExceeptionHandling;

public class Exhandle1 {

	public static void main(String[] args) {
		int[] x= {1,2,3,4};
		try {
			System.out.println(x[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Finished");
		}
		System.out.println("Continue");
		


	}

}
