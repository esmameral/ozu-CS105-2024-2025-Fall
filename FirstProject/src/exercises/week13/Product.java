package exercises.week13;

public class Product {
	private String code;
	private String name;
	private double price ;
	private Category category;
	
	
	public Product(String code, Category category, String name, double price) {
		super();
		this.code = code;
		this.category = category;
		this.name = name;
		this.price = price;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return name + " price=$" + price + "(" + category.getCode() + ", taxRate="+getCategory().getTaxRate()+"]";
	}
}
