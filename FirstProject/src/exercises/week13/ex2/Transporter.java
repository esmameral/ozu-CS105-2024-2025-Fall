package exercises.week13.ex2;

public interface Transporter {
	public static String ENVELOPE = "envelope";
	public static String SMALL_BOX = "small";
	public static String MEDIUM_BOX = "medium";
	public static String LARGE_BOX = "large";

	public double calculateShippingAmount(String fromCity,String toCity,String boxType, 
                                             double weight) throws Exception;

	public String getTransporterName();
}

