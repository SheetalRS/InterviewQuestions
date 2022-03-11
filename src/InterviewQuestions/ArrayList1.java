package InterviewQuestions;
//Replace Test2 with ReplacedTest
import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList arr= new ArrayList();
		arr.add("Test1");
		arr.add("Test2");
		arr.add("Test3");
		arr.add("Test4");
		arr.add("Test5");
		System.out.println(arr);
		
		System.out.println(arr.indexOf("Test2"));
		
		arr.add(arr.indexOf("Test2"), "ReplacedTest");
		arr.remove("Test2");
		System.out.println(arr);
		System.out.println(arr.indexOf("ReplacedTest"));
		
	}

}
