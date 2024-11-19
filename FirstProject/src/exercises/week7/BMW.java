
package exercises.week7;



public class BMW extends Car {
	
	
//	public String toString() {
//		
//		return this.getColor()+" BMW";
//	}

@Override
	public void doMaintenance() {
	System.out.println("BMW doMaintenance");
	}

	//	public void sayHello() {
//		System.out.println("Hello from BMW class");
//	}
	public BMW() {
		
		super();
		System.out.println("BMW constructor executed");
		
	}

//	public String getColor() {
//		return "Red ";
//	}

}
