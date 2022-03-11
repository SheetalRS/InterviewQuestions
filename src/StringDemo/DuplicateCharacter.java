package StringDemo;
// Print Duplicate characters
public class DuplicateCharacter {

	public static void main(String[] args) {
		String s= "TTTEESSSTTIIIINNNNGGGG";
		
		System.out.println(s);
		for (int i = 0; i < s.length(); i++) {
			int count=1;
			while (s.charAt(i)==s.charAt(i+1)) {
				count++;
				i++;
				if ((i+1)>=s.length()) {
					break;
				}
			}
			System.out.println(s.charAt(i) + " " +count);
		}
	}
}