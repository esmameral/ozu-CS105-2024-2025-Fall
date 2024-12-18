package exercises.week13.ex2;

public class Test {

	public static void main(String[] args) throws Exception {
		Transporter transporter1 = new OzuExpressDelivery();
		Transporter transporter2 = new TMDelivery();

		double tranporter1Price1 = transporter1.calculateShippingAmount("IST", "IST", Transporter.SMALL_BOX, 10);
		System.out.println("(1)Price for " + transporter1.getTransporterName() + ":" + tranporter1Price1);

		double tranporter2Price1 = transporter2.calculateShippingAmount("IST", "IST", Transporter.SMALL_BOX, 10);
		System.out.println("(2)Price for " + transporter2.getTransporterName() + ":" + tranporter2Price1);

		double tranporter1Price2 = transporter1.calculateShippingAmount("IST", "ANK", Transporter.SMALL_BOX, 10);
		System.out.println("(3)Price for " + transporter1.getTransporterName() + ":" + tranporter1Price2);

		double tranporter1Price3 = transporter1.calculateShippingAmount("IST", "IST", Transporter.LARGE_BOX, 110);
		System.out.println("(4)Price for " + transporter1.getTransporterName() + ":" + tranporter1Price3);


	}

}
