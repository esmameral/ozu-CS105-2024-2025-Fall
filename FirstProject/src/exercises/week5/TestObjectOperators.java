package exercises.week5;

import java.util.Scanner;

public class TestObjectOperators {
public static void main(String[] args) {
	Customer c1=new Customer(1,"Hakan");
	Customer c2=new Customer(2,"Eda");
	System.out.println(c1 instanceof Customer);
	System.out.println(c1 instanceof Object);
	
	System.out.println(c1.toString());
	System.out.println(c2);
	
	System.out.println(c1==c2);
	
	c1=c2;
	System.out.println(c1==c2);
	
	System.out.println(c1);
	System.out.println(c2);
	
	c1.setName("Can");
	System.out.println(c1);
	System.out.println(c2);
	
}
}
