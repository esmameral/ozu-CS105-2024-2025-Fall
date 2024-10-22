package exercises.week5;

import java.util.Scanner;

import exercises.week4.BankAccount;

public class TestObjectOperators {
	public static void main(String[] args) {
		//operatorExamples();
		equalMethodExample();
		
	}

	private static void equalMethodExample() {
		Customer customer = new Customer(1, "Hakan");
		Customer c3 = new Customer(1, "Hakan");
		Customer c4 = new Customer(3, "Cemal");
		Customer c2=customer;
		
		BankAccount account=new BankAccount("SUDE",200,988);
		
		//System.out.println(customer.equals(account));
		System.out.println(customer.equals(c2));
		System.out.println(c2.equals(c3));//true
		System.out.println(c3.equals(c4));//false. Because ids are not equal
		System.out.println(customer.equals(null));
		
		
	}

	public static void operatorExamples() {
		Customer c1 = new Customer(1, "Hakan");
		Customer c2 = new Customer(2, "Eda");
		System.out.println(c1 instanceof Customer);

		System.out.println(c1.toString());
		System.out.println(c2);

		System.out.println(c1 == c2);

		c1 = c2;
		System.out.println(c1 == c2);

		System.out.println(c1);
		System.out.println(c2);

		c1.setName("Can");
		System.out.println(c1);
		System.out.println(c2);
	}
}
