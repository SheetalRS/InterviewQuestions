package Abstraction;
//Abstraction means bodyless.
//using abstract class 0 to 100% abstraction is achieved.
//if you create method in the class as abstract then class must be abstract.
//we can't create the object of the class.
//  object is created with new Vehicle(); --- when Vehicle class constructor is checked java checks if there is abstract keyword or not.if abstract keyword found object will not be created.
//the class which extends abstract class must implement the abstract methods.
//abstract methods can't be private,final and static as they need to be overridden in child

public abstract class Vehicle {
	
	public abstract void engine();
	public abstract void color();
	public abstract void brakes();
	

}

