package exercises.week2;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * int i=(int)6.5; System.out.println(i);
		 * 
		 * double a=7; System.out.println(a);
		 * 
		 * 
		 * int x = 5; double z = x/2;//2 z=2.0 System.out.println(z);
		 * 
		 * 
		 * double price=35.6789; System.out.println((int)(price*100)/100.0);
		 */
		
		
		
		double num1,num2,sum;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number:");
		num1=input.nextDouble();
		System.out.println("Enter second number:");
		num2=input.nextDouble();
		sum=num1+num2;
		System.out.println("Sum:"+sum);
		
		
	
		
		
		
	}

}
