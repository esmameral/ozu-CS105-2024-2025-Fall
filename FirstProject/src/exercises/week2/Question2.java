package exercises.week2;

import java.util.Scanner;

/**
 * Write a program. Let your program take the 3 side lengths of a triangle from
 * the user and calculate the circumference of the triangle if the entries are
 * valid. In order for the entries to be valid, the sum of both sides of the
 * triangle must be greater than the 3rd edge.
 */
public class Question2 {

	public static void main(String[] args) {
		// Step 1: take the 3 side lengths of a triangle from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 3 side lengths:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		// Way-1
		if (a > b + c) {
			System.out.println("Not a valid triangle");
		} else if (b > c + a) {
			System.out.println("Not a valid triangle");
		} else if (c > b + a) {
			System.out.println("Not a valid triangle");
		} else {
			System.out.println("valid triangle");
			
		}

//Way-2

//		if (b + c > a && a + c > b && b + c > a)
//			System.out.println("valid triangle");
//		else
//			System.out.println("Not a valid triangle");
//		

	}

}
