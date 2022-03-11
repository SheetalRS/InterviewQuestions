package Polymorphysm;

public class MethodOverloading1 {

	public static void main(String[] args) {
		MethodOverloading1 m=new MethodOverloading1();
		m.add(5, 6);// even though numbers are in the range of byte and short..int method is printed
					//because numeric values are considered int by default. so int method gets called.
					//decimal numbers by default considered as double.
		
		byte x=5,y=6;
		m.add(x, y); // now it will call byte method

	}
	public byte add(byte x,byte y) {
		System.out.println("Inside byte");
		return (byte) (x+y);
		
	}
	public short add(short x,short y) {
		System.out.println("Inside short");
		return (short) (x+y);
		
	}
	public int add(int x,int y) {
		System.out.println("Inside Int");
		return x+y;
		
	}
	public long add(long x,long y) {
		System.out.println("Inside long");
		return x+y;
		
	}
}
