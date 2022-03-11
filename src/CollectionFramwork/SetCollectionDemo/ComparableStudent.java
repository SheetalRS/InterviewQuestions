package CollectionFramwork.SetCollectionDemo;

public class ComparableStudent implements Comparable<ComparableStudent> {
	int age;
	String name;
	float height;
	float weight;





	public ComparableStudent(int age, String name, float height, float weight) {
		
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}





	@Override
	public int compareTo(ComparableStudent o) {
		if (this.age>o.age) 
			return 1;
		else if(this.age<o.age)
			return -1;
		else
			return 0;

	}
}
