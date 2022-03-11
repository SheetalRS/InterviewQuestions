package JavaGenerics;

public class Generics3 {

	public static void main(String[] args) {
		byte b= 127;
		Byte bt= new Byte(b);
	//	Byte bk= new Byte(126); // compile time error
		System.out.println(bt);
	}

}
