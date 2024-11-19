package exercises.week7;

public class TestPolimorphism {
public static void main(String[] args) {
	Vehicle v1=new Car("34ETD65");
	Vehicle t=new Truck();
	Vehicle[] arr= {v1,t};
	VehicleMaintenance vm=new VehicleMaintenance();
	vm.startMaintenance(arr);
}
}
