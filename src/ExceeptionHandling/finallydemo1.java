package ExceeptionHandling;
//finally block wont be executed with System.exit(0)
public class finallydemo1 {

	public static void main(String[] args) {
		String s="Hello";
		try {
		
			System.out.println(s.charAt(4));
			System.out.println(4/0);
			System.exit(10);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Finished");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String Finished");
		}catch (Exception e) {
			System.out.println("Parent Exception class objct created");
			System.exit(0);
		}finally {
			System.out.println("I Executes always");
		}
		
		System.out.println("Continue");

	}

}
