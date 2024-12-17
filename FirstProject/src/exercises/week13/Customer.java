package exercises.week13;

import java.util.ArrayList;

public class Customer extends Person {

	private String taxNumber;
	private ArrayList<Product> shoppingCart = new ArrayList<Product>();

	public void addToShoppingCart(Product p) {
		shoppingCart.add(p);
	}

	public Customer(String name, Address address, String taxNumber) {
		super(name, address);
		this.taxNumber = taxNumber;

	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public ArrayList<Product> getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ArrayList<Product> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public void printInvoice() {
		System.out.println("Invoice info of " + getName());
		System.out.println("Customer Name: " + getName());
		System.out.println("Tax Number: " + taxNumber);
		System.out.println("Invoice Address:" + getAddress().toString());
		double totalPrice=0;
		for (Product product : shoppingCart) {
			System.out.println(product.toString());
			totalPrice+=product.getPrice()+product.getPrice()*product.getCategory().getTaxRate()/100.0;
		}
		System.out.println("Total Price:"+totalPrice);

	}

}
