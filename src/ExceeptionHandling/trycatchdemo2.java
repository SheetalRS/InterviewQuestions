package ExceeptionHandling;

public class trycatchdemo2 {

	public static void m1() {

		int[] x= {1,2,3,4};
		try {
			System.out.println(x[4]);
		} catch (Exception e) {
			System.out.println("Array finished");
		}
		
		System.out.println("I am in m1");

	}
	public static void m2() {
		m1();
		System.out.println("I am in m2");
	}
	public static void m3() {
		m2();
		System.out.println("I am in m3");

	}
	public static void main(String[] args) {
		m3();
		System.out.println("I am in main");

	}

}