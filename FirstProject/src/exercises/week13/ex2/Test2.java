package exercises.week13.ex2;

public class Test2 {

	public static void main(String[] args) throws Exception {
		Transporter motorTrp = new MotorcycleCourier(123, "John Doe", "34 JD 223");
		double p1=motorTrp.calculateShippingAmount("IST","IST",Transporter.SMALL_BOX, 1);
		System.out.println(motorTrp.getTransporterName() + " delivery price is:" + p1);

		double p2=motorTrp.calculateShippingAmount("IST","IST",Transporter.MEDIUM_BOX, 9);
		System.out.println(motorTrp.getTransporterName() + " delivery price is:" + p2);

		Transporter m = new MotorcycleCourier(123, "John Doe", "34 JD 223");
		double p3 = m.calculateShippingAmount("IST", "IST", Transporter.SMALL_BOX, 1);
		System.out.println("First Box price is:" + p3);
		double p4 = m.calculateShippingAmount("IST", "IST", Transporter.LARGE_BOX, 5);
		System.out.println("Second Box price is:" + p4);


	}

}
