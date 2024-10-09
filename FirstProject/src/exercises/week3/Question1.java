package exercises.week3;

public class Question1 {
public static void main(String[] args) {
	for (int row = 0; row < 5; row++) {
		for (int col = 0; col < row; col++) {
			System.out.print(" ");
		}
		for (int col=1 ; col<=5-row; col++) {
			System.out.print("X");
		}
		System.out.println("");
	}
}
}
