package InterfaceDemo;
//Interface can have abstract method
//Interface can have public static  method from java 1.8 and above
//Interface can have default method from java 1.8 and above
//variables are by default--- public,static and final
//it can't have block.

public interface I1 {
	
	int i=10;
	public void m1();
	public void m2();
	public void debit(int balance,int adhaenumber);
	public void balance(int accNum);
	default void credit(int balance,int adhaenumber) {
		
	}
	public static void withdrawAmt() {}
	

}
