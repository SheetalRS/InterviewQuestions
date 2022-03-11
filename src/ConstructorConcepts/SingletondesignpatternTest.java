package ConstructorConcepts;
//Singleton design pattern means allow only one object creation 
public class SingletondesignpatternTest {

	public static void main(String[] args) {
		Primeminister modi= Primeminister.getInstance();
		Primeminister gadkari= Primeminister.getInstance();
		Primeminister sheetal= Primeminister.getInstance();
		if (modi==gadkari||modi==sheetal||gadkari==sheetal) {
			System.out.println("Match");
		} else {
			System.out.println("Mis Match");
		}
	}

}
