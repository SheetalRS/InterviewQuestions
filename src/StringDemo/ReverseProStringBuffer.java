package StringDemo;

public class ReverseProStringBuffer {

	public static void main(String[] args) {
		String s=new String("Hello");
		StringBuffer sb= new StringBuffer(s);
		sb=sb.reverse();
		System.out.println(sb);
		

	}

}
