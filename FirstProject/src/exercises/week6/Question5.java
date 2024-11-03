package exercises.week6;

/**
 * Write a program which prints the count of zero rows of a two-dimensional
 * array. For example: 
 * int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {4, 5, 6}}; //1
 * int[][] arr = {{2, 1, 0}, {1, 3, 2}, {1, 0, 0}, {4, 5, 6}}; //0
 * int[][] arr = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {0,0,0}};//2
 * 
 */
public class Question5 {

	public static void main(String[] args) {
		int[][] arr1 = { {2, 1, 0}, 
						{0, 3, 2}, 
						{0, 0, 0}, 
						{4, 5, 6}};
		int[][] arr2={{2, 1, 0}, {1, 3, 2}, {1, 0, 0}, {4, 5, 6}};
		int[][] arr3 = {{2, 1, 0}, {1, 3, 2}, {0, 0, 0}, {0,0,0}};
		
		printZeroRowCount(arr1);
		printZeroRowCount(arr2);
		printZeroRowCount(arr3);
		
	}
	
	public static void printZeroRowCount(int[][] arr) {
		int zeroRowCount=0;
		for (int i = 0; i < arr.length; i++) {
			boolean allZero=true;
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]!=0) {
					allZero=false;
					break;
				}	
			}
			if(allZero) {
				zeroRowCount++;
			}
		}
		System.out.println("Zero row count="+zeroRowCount);
	}
	
	

}
