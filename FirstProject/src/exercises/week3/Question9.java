package exercises.week3;

/**
 * Write a program that ask user to enter two integer numbers. Find greatest
 * common divisor of these numbers. The greatest common divisor (gcd) of the two
 * integers 4 and 2 is 2. The greatest common divisor of the two integers 16 and
 * 24 is 8.
 */
public class Question9 {

	public static void main(String[] args) {
		int a=16;
		int b=24;
		int gcd=1;
		
		for(int i=1;i<=Integer.min(a, b);i++) {
			if(a%i==0&&b%i==0) {
				gcd=i;
			}
		}
		System.out.println("GCD:"+gcd);

	}

}
