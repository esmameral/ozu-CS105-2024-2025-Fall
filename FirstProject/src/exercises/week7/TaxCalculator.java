package exercises.week7;

public class TaxCalculator {
	public static void main(String[] args) {
		Taxable car=new Car();
		Taxable house=new House();
		Taxable emp=new Employee(1, "Mustafa");
		
		Taxable[] arr= {car,house,emp};
		for (Taxable object : arr) {
			System.out.println(object.getClass().getName()+object.getTaxAmount());
		}
		
	}
}
