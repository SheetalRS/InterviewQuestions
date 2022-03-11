
package ConstructorConcepts;
//NoParameterConst is written by programmer.
//when object is created it gets called.
//Constructor is special method having no return Type.
//its name should be same as class name.
//it must have body.
//it is used to create the object and initialize instance variable
public class NoParameterConst {
	
	
	public NoParameterConst(){
		System.out.println("I am in Constructor");
	}
	public static void main(String[] args) {
		NoParameterConst t= new NoParameterConst();
		
		System.out.println("I am in Main Method");

	}

}
