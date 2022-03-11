package StringDemo;

public class PrintOnlySplChar {

	public static void main(String[] args) {
		String s="He||o Test!ng Sh@shtr@";
		
		for (char ch : s.toCharArray()) {
			
			if (!(ch>='0' && ch<='9' ||ch>='a' && ch<='z'||ch>='A' && ch<='Z'||ch==' ')) {
				System.out.println(ch);
			}else {
				
			}
		}
	}

}
