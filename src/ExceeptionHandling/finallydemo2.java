package ExceeptionHandling;

public class finallydemo2 {

	public static void main(String[] args) {
		String s="Hello";
		try {
		
			System.out.println(s.charAt(4));
			Thread.sleep(10000);
			
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
