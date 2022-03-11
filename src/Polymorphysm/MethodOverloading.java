package Polymorphysm;
//Polymorphysm -Many forms
//naam ek kaam anek
//Polymorphysm only done for methods.
//Method name must be same
//argument should be different.
public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading x= new MethodOverloading();
		int sum=x.add(1,2,3,4,5);
		System.out.println(sum);
		
		double sum1=x.add(2.5,3.5,5.5);
		System.out.println(sum1);

	}
	
	public int add(int x,int y) {
		
		return x+y;
	}
	public float add(float x,float y) {
		
		return x+y;
	}
	public int add(int x,int y,int z) {
		
		return x+y+z;
	}
	public int add(int... x) {//vararg --variable argument ..it takes input as array..
		int result=0;
		for (int i : x) {
			result=result+i;
		}
		
		return result;
		
	}
	public double add(double... x) {//vararg --variable argument ..it takes input as array..
		double result=0;
		for (double i : x) {
			result=result+i;
		}
		
		return result;
		
	}


}
