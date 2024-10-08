package exercises.week2;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a positive int number:");
		int n = in.nextInt();
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = 1.0 / (i* (i + 1)) + sum;
		}
		System.out.println(sum);

	}

}
