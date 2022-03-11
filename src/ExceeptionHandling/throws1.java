package ExceeptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class throws1 {

	public static void m1() throws FileNotFoundException{

		FileInputStream fis= new FileInputStream("C:\\Users\\Ravi\\Documents\\Book1.xlsx");
		System.out.println("I am in m1");

	}
	public static void m2() throws FileNotFoundException{
		m1();
		System.out.println("I am in m2");
	}
	public static void m3() throws FileNotFoundException{
		m2();
		System.out.println("I am in m3");

	}
	public static void main(String[] args) {
		try {
			m3();
		} catch (FileNotFoundException e) {
			System.out.println("Check file");
		}
		
		System.out.println("I am in main");

	}


}
