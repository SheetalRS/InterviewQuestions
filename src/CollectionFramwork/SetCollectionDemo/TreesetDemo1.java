package CollectionFramwork.SetCollectionDemo;
//all the elements are object of student datatype.
//but comipler dont understand how to compare elements.
//so student class has to implement Comparable interface then the error of classcast exception will be gone.
//check TreesetDemo2 for this solution
import java.util.TreeSet;

public class TreesetDemo1 {

	public static void main(String[] args) {
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		Student s5= new Student();
		
		TreeSet ts=new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		
		System.out.println(ts);

	}

}
