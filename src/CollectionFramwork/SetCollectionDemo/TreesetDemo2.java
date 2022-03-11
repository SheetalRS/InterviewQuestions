package CollectionFramwork.SetCollectionDemo;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetDemo2 {

	public static void main(String[] args) {
		ComparableStudent s1= new ComparableStudent(41,"sheetal",155.5f,60.4f);
		ComparableStudent s2= new ComparableStudent(10,"simran",150.5f,30.4f);
		ComparableStudent s3= new ComparableStudent(43,"Ravi",158.5f,68.4f);
		ComparableStudent s4= new ComparableStudent(15,"khushi",153.5f,50.4f);
		ComparableStudent s5= new ComparableStudent(11,"teju",153.5f,55.4f);
		
		TreeSet<ComparableStudent> ts=new TreeSet<ComparableStudent>();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		
		Iterator<ComparableStudent> it= ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().name);
			
		}
		

	}

}
