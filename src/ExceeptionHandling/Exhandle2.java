package ExceeptionHandling;

public class Exhandle2 {

	public static void main(String[] args) {
		int[] x= {1,2,3,4};
		String s="Hello";
		try {
			System.out.println(x[3]);
			System.out.println(s.charAt(7));
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Finished");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Finished");
		}
		System.out.println("Continue");
		

	}

}
