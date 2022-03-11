package StringDemo;

public class StringBuilderDemo {

	public static void main(String[] args) {
		String s=new String("Hello");
		StringBuilder sb= new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);

	}

}
