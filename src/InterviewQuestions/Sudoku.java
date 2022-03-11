package InterviewQuestions;

public class Sudoku {

	public static void main(String[] args) {
		int n=9;
		 int x[][] = new int[3][3];
		 
		
		 printArray( x);
		for (int i = 0; i < x.length;i++ ) {
			for (int j = 0; j < x.length;j++ ) {
				 for (int num = 1; num <= 9;) {
					
					 if (!RowIsExists(i,num,x)) {
						 
							
							  if (!ColIsExists(j,num,x)){
							  
							  if (!IsExistsInBlock(i,j,num,x)) {
								  x[i][j]=num; break; 
								  }
							  
							  
							  }
							 
						
						} else {
							num++;
							
						}
					
				}
					
				}
			}
			
		
		 printArray( x);
	}
	public static void printArray(int[][] arr){
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 ;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static boolean RowIsExists( int row,int num,int[][] arr) {
		boolean IsExistsInRow=false;
		for (int c = 0; c < 3;c++) {
			if (arr[row][c]==num) {
				IsExistsInRow= true;
				break;
			}
			
		}
		return IsExistsInRow;

	}
	public static boolean ColIsExists(int col,int num,int[][]arr) {
		
		boolean IsExistsInCol=false;
		for (int r = 0; r < 3; r++) {
			if (arr[r][col]==num) {
				IsExistsInCol= true;
				
				break;
			}
			
		}
		
		return IsExistsInCol;

	}
	
	public static boolean IsExistsInBlock(int row,int col,int num,int[][]x) {
		boolean IsExistsInBlock=false;
		row= row-row%3;
		col= col-col%3;
		for (int i = row; i < row+3; i++) {
			for (int j = col; j < col+3; j++) {
				if (x[i][j]==num) {
					IsExistsInBlock=true;
					break;
					
				}
				
			}
			if (IsExistsInBlock) {
				break;
			}
			
		}
		
		return IsExistsInBlock;
	}
	
}
