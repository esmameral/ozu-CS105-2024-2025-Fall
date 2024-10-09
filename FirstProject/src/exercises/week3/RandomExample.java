package exercises.week3;

import java.util.Scanner;

/**
 * Write a program which takes the size and the values of the array from the
 * user, and finds the number of elements which are divisible by 5. Put these
 * values into a new array.
 */
public class RandomExample {
	public static void main(String[] args) {
		int count=0;
		int size=100;
		int[] numbers=new int[size];
		
		//Filling array with random numbers between [10,99]
		for(int i=0;i<size;i++) {
			numbers[i]=(int)(Math.random()*90+10);
			if(numbers[i]<50) {
				count++;
			}
		}
		int j=0;
		int[] newArray=new int[count];
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]<50) {
				newArray[j]=numbers[i];
				System.out.println(newArray[j]);
				j++;
			}
		}
		System.out.println("Element count<50 is "+newArray.length);
		
	}

}
