package exercises.week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Ebrar");
		names.add("Deniz");
		names.add("Yigit");
		names.add("Elif");
		names.remove(2);
		names.add(1, "Sude");
		names.set(0, "Omer");
		names.remove("Deniz");

		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}

		ArrayList<Customer> customers = new ArrayList<Customer>();
		Customer customer1 = new Customer(14, "Hasan");
		Customer customer2 = new Customer(7, "Berke");
		Customer customer3 = new Customer(3, "Can");
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer3);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("-------------------");
		Collections.sort(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
		System.out.println("-------------------");
		Collections.sort(customers,new CustomerNameComparator());
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

}
