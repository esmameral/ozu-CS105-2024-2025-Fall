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

}
