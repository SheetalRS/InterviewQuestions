package InterfaceDemo;
//balance method is common in both interfaces so implemented only once
//debit method has diff arguments so implemented twice
// if method have same name but different argument or diff return type then both methods has to implemented in class
public class Test implements I1,I2{

	public static void main(String[] args) {
		
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void debit(int balance, int adhaenumber, int accNum) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void debit(int balance, int adhaenumber) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void balance(int accNum) {
		// TODO Auto-generated method stub
		
	}
}