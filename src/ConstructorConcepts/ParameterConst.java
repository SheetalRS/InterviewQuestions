package ConstructorConcepts;
//Parameterize Constructor is used to  initialize instance variable
// here y is not initialized so its default value 0 printed
//here str2 is not initialized so its default value null printed
//this keyword is used to access instance variable,method,constructor
//this() ---call the contructor
//constructor call should be from other constructor only;
public class ParameterConst {
		int x,y;
		String str1,str2;
	
	public ParameterConst(int x,int y,String str1,String str2){
		this.x=x;
		//this.y=y;
		this.str1=str1;
		//this.str2=str2;
	}
	public static void main(String[] args) {
		ParameterConst t= new ParameterConst(10,20,"Hello","Testing Shashtra");
		t.display();
		
	}
	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(str1);
		System.out.println(str2);
	}

}
