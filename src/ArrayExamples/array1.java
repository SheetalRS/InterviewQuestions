package ArrayExamples;

public class array1 {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2= {7,8,9,10,11,12
				};
		
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i]%2==0 && arr2[j]!=0) {
					int temp=arr2[j];
					arr2[j]=arr1[i];
					arr1[i]=temp;
				} 
			}
		}
		
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + " ");
		}
		System.out.println();
		for (int k = 0; k < arr2.length; k++) {
			System.out.print(arr2[k] + " ");
		}

	}

}
