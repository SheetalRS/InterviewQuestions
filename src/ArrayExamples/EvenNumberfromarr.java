package ArrayExamples;
//Print index of child array which contains even number
public class EvenNumberfromarr {

	public static void main(String[] args) {
		int[][] arr1= {{1,2,3,4},{1,3},{1,5},{6,7,8,9}};
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr1[i].length; j++) {
				
				
				if (arr1[i][j]%2==0) {
					System.out.println("Even numbers are at " + i + " index");
					break;
				} 
			}
			
		}

	}

}
