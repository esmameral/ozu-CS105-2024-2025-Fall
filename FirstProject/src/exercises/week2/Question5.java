package exercises.week2;

import java.util.Scanner;

/**
 * Write a program that repeatedly asks the user for an integer and calculates
 * the sum of those numbers. When the total exceeds 100, your program should
 * stop asking for a new integer and print the number count and average of the
 * numbers to the screen. Solve the problem using both "while" and "do-while"
 * 
 */
public class Question5 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		int count=0;
		while(total<=100) {
			System.out.println("Enter an integer:");
			int number=input.nextInt();
			total+=number;//total=total+number;
			count++;
		}
		
//		 do{
//			System.out.println("Enter an integer:");
//			int number=input.nextInt();
//			total+=number;//total=total+number;
//			count++;
//		}while(total<100);
			
		System.out.println("Total:"+total);
		System.out.println("Number count:"+count);
		//System.out.println("Avg:"+(double)total/count);
		System.out.println("Avg:"+total/(1.0*count));
	}
	
	

}
