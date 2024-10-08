package exercises.week3;

public class MultiDimensionalArrays extends ArrayExamples {

	public static void main(String[] args) {
		int[][] numbers = new int[2][5];

		System.out.println(numbers.length);
		
		
		
		numbers[0][3]=12;
		numbers[1][2]=7;
		numbers[1][4]=20;
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//int[][] grades=new int[3][3];//Same
		int[][] grades= {
					{10,50,90},
					{86,88,45,7,7},
					{78,12,67}};
		
		System.out.println(grades[1][1]);//88
		System.out.println(grades[0][2]);//90
		
		
		for (int row = 0; row < grades.length; row++) {
			for (int col = 0; col < grades[row].length; col++) {
				System.out.print(grades[row][col]+" ");
			}
			System.out.println();
		}
	}

}
