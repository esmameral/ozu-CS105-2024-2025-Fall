package exercises.week3;

import java.util.Scanner;

/**
 * Write a program which takes the size and the values of the array from the
 * user, and finds the number of elements which are divisible by 5. Put these
 * values into a new array.
 */
public class Question4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the size of the array:");
		int size=in.nextInt();
		int[] numbers=new int[size];
		System.out.println();
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter numbers["+i+"]:");
			numbers[i]=in.nextInt();
			if(numbers[i]%5==0) {
				count++;
			}
		}
		int j=0;
		int[] newArray=new int[count];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]%5==0) {
				newArray[j]=numbers[i];
				System.out.println(newArray[j]);
				j++;
			}
		}
		
	}

}
