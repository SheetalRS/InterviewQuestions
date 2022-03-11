package CollectionFramwork.SetCollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class CarCheck {

	public static void main(String[] args) {
		Car c1= new Car("White", "Ertiga", 15.5f,"Diesel" );
		Car c2= new Car("Red", "i20", 17.5f,"Petrol" );
		Car c3= new Car("Grey", "Amaze", 18.5f,"Petrol" );
		Car c4= new Car("Grey", "i10", 12.5f,"Petrol" );
		
		TreeSet
		ts= new TreeSet(new CarAvegareComparator());
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		Iterator<Car> it = ts.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next().name);
		}

	}

}
