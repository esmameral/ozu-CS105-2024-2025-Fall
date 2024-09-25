package exercises.week1;
/*
 * Question 3: Finding Digits
 * Write a program that prints the digits of a four-digit number one by one on the screen.
 * Your program also should print the sum of its digits.
 */
public class Question3 {

	public static void main(String[] args) {
		int number=6547;
		int firstDigit=number%10;
		int secondDigit=number%100/10;
		int thirdDigit=number/100%10;
		int fourthDigit=number/1000;
		
		System.out.println("First Digit:"+firstDigit);
		System.out.println("Second Digit:"+secondDigit);
		System.out.println("Third Digit:"+thirdDigit);
		System.out.println("Fourth Digit:"+fourthDigit);
		System.out.println("Sum of the digits:"+(firstDigit+secondDigit+thirdDigit+fourthDigit));

	}

}
