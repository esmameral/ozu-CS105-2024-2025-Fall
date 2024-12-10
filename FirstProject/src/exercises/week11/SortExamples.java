package exercises.week11;

import java.util.HashSet;
import java.util.TreeSet;

public class SortExamples {
public static void main(String[] args) {

	TreeSet<Customer> customers=new TreeSet<Customer>(new CustomerNameComparator());
	Customer customer1=new Customer(12, "Hasan");
	Customer customer2=new Customer(2, "Berke");
	Customer customer3=new Customer(31, "Can");
	customers.add(customer1);
	customers.add(customer2);
	customers.add(customer3);
	customers.add(customer3);
	
	
	
	for (Customer customer : customers) {
		System.out.println(customer);
	}
	
	TreeSet<String> names=new TreeSet<String>();
	names.add("Mert");
	names.add("Ali");
	names.add("Arda");
	names.add("Suleyman");
	for (String name : names) {
		System.out.println(name);
	}


}
}
