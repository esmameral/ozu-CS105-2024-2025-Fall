package exercises.week13.ex2;

public class OzuExpressDelivery extends Company implements Transporter{

	@Override
	public String getAddress() {
		return "Cekmekoy Tasdelen mahallesi Erdem sokak n:4";
	}

	@Override
	public String getOfficialName() {
		return "Ozu Express Delivery T.A.S";
	}

	@Override
	public String getEmail() {
		return "info@ozuexpress.com.tr";
	}

	@Override
	public String getTaxNumber() {
		return "1113342134";
	}

	@Override
	public double calculateShippingAmount(String fromCity, String toCity, String boxType, 
			double weight)	throws Exception {
		double price=0;
		if(boxType.equals(Transporter.ENVELOPE)) {
			price=75;
		}else if(boxType.equals(Transporter.SMALL_BOX)) {
			price=100;
		}else if(boxType.equals(Transporter.MEDIUM_BOX)) {
			price=150;
		}else if(boxType.equals(Transporter.LARGE_BOX)) {
			price=200;
		}
		
		if(!fromCity.equals(toCity)) {
			price+=price*0.15;
		}

		if(weight>=30 && weight<50) {
			price+=110;
		}else if(weight>=50 && weight<75) {
			price+=150;
		}
		else if(weight>=75 && weight<100) {
			price+=250;
		}else if(weight>100 ) {
			price+=2500;
		}
		
		return price;
	}

	@Override
	public String getTransporterName() {
		return getOfficialName();
	}

}
