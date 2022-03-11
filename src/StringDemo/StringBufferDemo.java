package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		String s=new String("Hello");
		s.concat("Testing Shashtra");
		
		System.out.println(s);
		
		StringBuffer sb= new StringBuffer("Hello");
		sb.append(" Testing Shashtra");
		System.out.println(sb);
	}

}
