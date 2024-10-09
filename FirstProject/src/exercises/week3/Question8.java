package exercises.week3;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] summary = new String[5];
		int correctCount = 0;
		int correctAnswer = 0;
		String question;
		for (int i = 0; i < 5; i++) {
			int firstNumber = (int) (Math.random() * 10);
			int secondNumber = (int) (Math.random() * 10);

			if (firstNumber > secondNumber) {
				question = "What is " + firstNumber + "-" + secondNumber;
				correctAnswer = firstNumber - secondNumber;
			} else {
				question = "What is " + secondNumber + "-" + firstNumber;
				correctAnswer = secondNumber - firstNumber;
			}
			System.out.println(question + "=?");

			int userAnswer = input.nextInt();
			question += "=" + userAnswer;
			if (correctAnswer == userAnswer) {
				System.out.println("You are correct!");
				question += " correct";
				correctCount++;
			} else {
				System.out.println("Your answer is wrong.");
				question += " wrong";
			}
			summary[i] = question;
		}
		System.out.println("Correct	count is " + correctCount);
		for (int i = 0; i < 5; i++) {
			System.out.println(summary[i]);
		}


	}

}
