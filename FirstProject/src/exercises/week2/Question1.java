package exercises.week2;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter principal amount:");
		double principalAmount = input.nextDouble();

		System.out.println("Enter duration:");
		int duration = input.nextInt();

		System.out.println("Enter interest rate:");
		double interestRate = input.nextDouble();

		double interestAmount = principalAmount * duration * interestRate / 1200;
		// Interest Amount= principal * duration * InterestRate / 1200
		System.out.println("Interest Amount:" + interestAmount);

	}

}
