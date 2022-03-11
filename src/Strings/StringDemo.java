package Strings;

public class StringDemo {

	public static void main(String[] args) {
		String str= "Hello";//Immutable
		str.concat(" Testing Shastra");
		System.out.println("Using String : " +str);
		System.out.println("Using String : " +  str.concat(" Testing Shastra"));
		
		
		StringBuffer sb= new StringBuffer("Hello"); //mutable and thread safe
		sb.append(" Testing Shastra");
		System.out.println("Using StringBuffer : " + sb);
		
		StringBuilder sbd= new StringBuilder("Hello");//mutable and no thread safe
		sbd.append(" Testing Shastra");
		System.out.println("Using StringBuilder : " +sbd);
		
	}

}
