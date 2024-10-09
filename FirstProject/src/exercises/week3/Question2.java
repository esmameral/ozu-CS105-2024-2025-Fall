package exercises.week3;

import java.util.Scanner;

/**
 * Generate a random number and don’t display that number user. Let the user
 * repeatedly guess a number until it is correct. The problem is to guess what
 * number a computer has in mind. You will write a program that randomly
 * generates an integer between 10 and 99, inclusive. The program prompts the
 * user to enter a number continuously until the number matches the randomly
 * generated number. For each user input, the program tells the user whether the
 * input is too low or too high, so the user can make the next guess
 * intelligently.
 */
public class Question2 {

	public static void main(String[] args) {
		int randomNumber=(int)(Math.random()*90+10);
		Scanner in=new Scanner(System.in);
		int counter=0;
		while(true) {
			System.out.println("Your guess:");
			int guess=in.nextInt();
			counter++;
			if(randomNumber==guess) {
				System.out.println("You are correct!");
				break;
			}else if(randomNumber<guess) {
				System.out.println("Your guess is high");
			}else {
				System.out.println("Your guess is low");
			}	
		}
		System.out.println("You guessed number "+counter+" tries");
	}

}
