package ExceeptionHandling;

public class finallyDemo {

	public static void main(String[] args) {
		int[] x= {1,2,3,4};
		String s="Hello";
		try {
			System.out.println(x[3]);
			System.out.println(s.charAt(4));
			System.out.println(4/0);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Finished");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Finished");
		}catch (Exception e) {
			System.out.println("Parent Exception class objct created");
		}finally {
			System.out.println("I Executes always");
		}
		
		System.out.println("Continue");
	}

}
