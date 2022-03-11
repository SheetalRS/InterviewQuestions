package Polymorphysm;

public class Test extends MethodOverriding {

	public static void main(String[] args) {
		Test t= new Test();
		t.add(1, 2);
		t.sub(20, 10);
		

	}
	@Override
	public int add(int x,int y) {
		System.out.println("Inside Test Add");
		return x+y;
		
	}
	@Override
	public int sub(int x,int y) {
		System.out.println("Inside Test sub");
		return x-y;
		
	}

}
