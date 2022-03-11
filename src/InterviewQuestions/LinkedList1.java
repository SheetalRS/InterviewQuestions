package InterviewQuestions;
//insert specified element at the end of Linked List
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("Test1");
		l.add("Test2");
		l.add("Test3");
		l.add("Test4");
		l.add("Test5");
		
		System.out.println(l);
		l.offerLast("Last Element");
		System.out.println(l);
	}

}
