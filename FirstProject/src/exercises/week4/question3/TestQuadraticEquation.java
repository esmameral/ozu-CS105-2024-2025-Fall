package exercises.week4.question3;

import java.util.Scanner;

public class TestQuadraticEquation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Coefficients");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		QuadraticEquation eq=new QuadraticEquation(a,b,c);
		eq.print();
		

	}

}
