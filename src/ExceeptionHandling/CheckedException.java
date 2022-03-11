package ExceeptionHandling;
//checked exception are exception which java predicts at compile time
import java.io.FileInputStream;

public class CheckedException {

	public static void main(String[] args) {
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Ravi\\Documents\\Book1.xlsx");
		System.out.println(fis);

	}

}
