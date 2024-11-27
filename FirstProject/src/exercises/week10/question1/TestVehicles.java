package exercises.week10.question1;

public class TestVehicles {

	public static void main(String[] args) {
		Car car=new Car(10,20);
		System.out.println(car);
		SportsCar sportCar=new SportsCar(20,40);
		System.out.println(sportCar);
		HatchbackCar hatchback=new HatchbackCar(1,2);
		System.out.println(hatchback);
		sportCar.moveBy(10, 10);
		System.out.println(sportCar);

	}

}
