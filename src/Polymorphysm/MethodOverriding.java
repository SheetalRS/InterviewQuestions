package Polymorphysm;
//  Done in class having parent child relation.
//parent method are overidden in child
//method name should be same
//method argument must be same.
//return type must be same.
//Visiblity of method can be increased..can't be reduced.
//we cant override private,final and static methods.
//private are not accebible in child class they are accesible within class only.
//static methods ownership is on class and stored in metaspace.
//overriding is runtime polymorphysm ,associated with objects .having separate copies for each object
//so main method cant be overridden.
public class MethodOverriding {

	public int add(int x,int y) {
		System.out.println("Inside MethodOverriding Add");
		return x+y;
		
	}
	public int sub(int x,int y) {
		System.out.println("Inside MethodOverriding sub");
		return x-y;
		
	}
}
