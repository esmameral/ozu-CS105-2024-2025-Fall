package exercises.week2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int number = in.nextInt();

		System.out.println(number % 2);
		switch (number % 2) {
		case 1:
			System.out.println(number + " is an odd number");
			break;
		case 0:
			System.out.println(number + " is an even number");
			break;
		default:
			System.out.println("invalid");
		}

	}

}
