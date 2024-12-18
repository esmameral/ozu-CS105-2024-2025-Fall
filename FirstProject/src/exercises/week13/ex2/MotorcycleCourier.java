package exercises.week13.ex2;

import exercises.week7.question4.Person;

public class MotorcycleCourier extends Person implements Transporter {
	private String plateNumber;

	public MotorcycleCourier(int id, String name, String plateNumber) {
		super(id, name);
		this.plateNumber=plateNumber;
	}

	@Override
	public double calculateShippingAmount(String fromCity, String toCity, String boxType, double weight)
			throws Exception {

		double price = 0;
		if (boxType.equals(Transporter.LARGE_BOX))
			throw new Exception("Motorcycle courier can carry only envelopes, small and medium boxes");
		if (!fromCity.equals(toCity))
			throw new Exception("Motorcycle courier is only available in the same city");
		if (weight > 10)
			throw new Exception("Motorcycle courier cannot carry packages weight>10");

		if (boxType.equals(Transporter.ENVELOPE)) {
			price = 100;
		} else if (boxType.equals(Transporter.SMALL_BOX)) {
			price = 150;
		} else if (boxType.equals(Transporter.MEDIUM_BOX)) {
			price = 200;
		}

		return price;

	}

	@Override
	public String getTransporterName() {

		return getName();
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

}
