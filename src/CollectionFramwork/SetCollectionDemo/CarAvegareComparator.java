package CollectionFramwork.SetCollectionDemo;

import java.util.Comparator;

public class CarAvegareComparator implements Comparator<Car>{

	



	@Override
	public int compare(Car o1, Car o2) {
		if (o1.average<o2.average) 
			return -1;
		else if(o1.average>o2.average) 
			return 1;
		else
		return 0;
	}
}
