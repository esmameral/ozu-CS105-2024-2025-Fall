package exercises.week13;

public class Category {

	private String code;
	private double taxRate;
	public Category(String code, double taxRate) {
		super();
		this.code = code;
		this.taxRate = taxRate;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
}
