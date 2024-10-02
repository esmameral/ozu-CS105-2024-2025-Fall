package exercises.week2;

import java.util.Scanner;

/**
 * Write a program that asks the user for two double numbers and provides a menu
 * for addition, subtraction, multiplication and division. Print the result of
 * the user-selected operation on the screen. Write program with the switch-case
 * command.
 * 
 */
public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number:");
		double a=scan.nextDouble();
		System.out.println("Enter second number:");
		double b=scan.nextDouble();
		
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("Enter your choice:");
		int choice=scan.nextInt();
		switch (choice) {
		case 1: {
			System.out.println("Sum:"+(a+b));break;
		}case 2: {
			System.out.println("Sub:"+(a-b));break;
		}case 3: {
			System.out.println("Multiply:"+(a*b));break;
		}case 4: {
			System.out.println("Divide:"+(a/b));break;
		}default:
			System.out.println("invalid choice");
	}
	}
}
