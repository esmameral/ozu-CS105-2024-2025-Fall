package exercises.week5;

public class TestStatic {

	public static void main(String[] args) {
		Customer c3 = new Customer(1, "Hakan");
		Customer c1 = new Customer(12, "Ali");
		System.out.println(Customer.getCount());//Correct usage
		System.out.println(c3.getCount());
		Customer c2 = new Customer();
		System.out.println(Customer.getCount());//Correct usage

		//Customer.setCount(5);
		
		System.out.println(c3.getCount());
		System.out.println(c1.getCount());
		System.out.println(Customer.getCount());//Correct usage

		
	}

}
