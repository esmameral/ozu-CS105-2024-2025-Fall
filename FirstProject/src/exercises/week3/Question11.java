package exercises.week3;

import java.util.Iterator;

/**
 * Perfect number: A positive integer is called a perfect number if it is equal
 * to the sum of all of its positive divisors, excluding itself. For example, 6
 * is the first perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 +
 * 4 + 2 + 1. There are 3 perfect numbers <1000. Write a program to find all
 * these 3 numbers.
 */
public class Question11 {
	public static void main(String[] args) {
		for(int i=2;i<=10000;i++) {
			if(isPerfectNumber(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	public static boolean isPerfectNumber(int a){
		int sum=1;
		for(int i=2;i<=a/2;i++) {
			if(a%i==0)
				sum+=i;
		}
		if(sum==a) {
			return true;
		}else
			return false;
		
	}
}
