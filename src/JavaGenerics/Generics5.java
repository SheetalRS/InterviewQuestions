package JavaGenerics;

public class Generics5 {

	public static void main(String[] args) {
		int x=20,y=20;
		if (WhoIsGreater( x,y)==0) {
			System.out.println("Both are Equal");
		} else if(WhoIsGreater( x,y)<0) {
			System.out.println(x +" is smaller than " + y);
		}else if(WhoIsGreater( x,y)>0) {
			System.out.println(x+ " is greater than " + y);
		}

	}
	
	public static  int WhoIsGreater(int x,int y) {
		return Integer.compare(x, y);
	}

}
