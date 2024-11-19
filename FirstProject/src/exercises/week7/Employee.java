package exercises.week7;

import exercises.week7.question4.Person;

public class Employee extends Person implements Taxable {

	public Employee(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTaxRate() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return 3000;
	}

}
