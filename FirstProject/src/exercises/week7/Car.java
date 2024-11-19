package exercises.week7;

public class Car extends Vehicle {
	
	public Car() {
		this("honda");
		System.out.println("Car constructor executed");
	}
    
	public Car(String name) {
		super();
		System.out.println("Car constructor executed");
	}
	
	
//	public String getColor() {
//		return "Blue ";
//	}
	
	public void sayHello() {
		System.out.println("Hello from Car class");
	}

	public String toString() {
		return super.getColor()+ " Car";
	}

	@Override
	public void doMaintenance() {
		System.out.println("Car doMaintenance");
		
	}

	@Override
	public double getTaxRate() {
		// TODO Auto-generated method stub
		return 17;
	}

	@Override
	public double getTaxAmount() {
		// TODO Auto-generated method stub
		return 2500;
	}

}
