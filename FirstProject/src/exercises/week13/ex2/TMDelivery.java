package exercises.week13.ex2;

public class TMDelivery extends Company implements Transporter{

	@Override
	public String getAddress() {
		
		return "Cekmekoy Ataturk cd. No:12";
	}

	@Override
	public String getOfficialName() {
		return "Trust Me Delivery A.Ş.";
	}

	@Override
	public String getEmail() {
		return "trustme@trustme.com.tr";
	}

	@Override
	public String getTaxNumber() {
		return "2937982137";
	}

	@Override
	public double calculateShippingAmount(String fromCity, String toCity, String boxType, double weight)
			throws Exception {
		
			

		
		double price=0;
		if(boxType.equals(Transporter.ENVELOPE)) {
			price=40;
		}else if(boxType.equals(Transporter.SMALL_BOX)) {
			price=50;
		}else if(boxType.equals(Transporter.MEDIUM_BOX)) {
			price=70;
		}else if(boxType.equals(Transporter.LARGE_BOX)) {
			price=100;
		}
		
		if(!fromCity.equals(toCity)) {
			price+=price*0.25;
		}

		if(weight>=20 && weight<35) {
			price+=110;
		}else if(weight>=35 && weight<70) {
			price+=150;
		}
		else if(weight>=70) {
			price+=(weight-70)*15;
		}
		//tax
		price+=price*0.20+price*0.025;
		return price;
	
	}

	@Override
	public String getTransporterName() {
		
		return getOfficialName();
	}

}
