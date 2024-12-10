package exercises.week11;

import java.util.HashSet;



public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Customer> customers=new HashSet<Customer>();
		Customer customer1=new Customer(1, "Hasan");
		Customer customer2=new Customer(2, "Berke");
		Customer customer3=new Customer(3, "Can");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer3);
		
		for (Customer customer : customers) {
			System.out.println(customer);
		}

	}

}
