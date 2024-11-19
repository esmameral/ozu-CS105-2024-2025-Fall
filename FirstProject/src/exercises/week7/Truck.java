package exercises.week7;

public class Truck extends Vehicle {

	@Override
	public void doMaintenance() {
		System.out.println("Truck doMaintenance");

	}

	@Override
	public double getTaxRate() {
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return 10000;
	}

}
