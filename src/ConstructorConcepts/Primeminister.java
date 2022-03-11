package ConstructorConcepts;

public class Primeminister {
	
	public static Primeminister p= new Primeminister();
	private Primeminister(){
		
	}
	public static Primeminister getInstance() {
		return p;
		
	}
	
}
