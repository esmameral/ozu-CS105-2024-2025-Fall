package exercises.week11.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ProductManager1 {
	private ArrayList<Product> products = new ArrayList<Product>();

	public ProductManager1() {
		super();
		Product p1 = new Product(21, "Pen", 16, "P001", 20);
		Product p2 = new Product(2, "Pencil", 14, "P002", 2);
		Product p3 = new Product(2, "Eraser", 10, "P003", 10);
		Product p4 = new Product(3, "Book", 40, "P041", 30);
		Product p5 = new Product(11, "Glass", 12, "P056", 40);
		Product p6 = new Product(22, "Notebook", 16, "P71", 21);
		Product p7 = new Product(41, "Bag", 100, "P881", 22);
		Product p8 = new Product(40, "Tablet", 300, "P81", 10);
		Product p9 = new Product(41, "Backpack", 150, "P981", 15);
		Product p10 = new Product(16, "Mouse", 77, "P991", 25);
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		products.add(p6);
		products.add(p7);
		products.add(p8);
		products.add(p9);
		products.add(p10);
	}

	public void sortProductsById() {
		Collections.sort(this.products);
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public void sortProductsByPrice() {
		Collections.sort(this.products, new ProductPriceComparator());
		for (Product product : products) {
			System.out.println(product);
		}
	}

	public void sortProductsByName() {
		Collections.sort(this.products, new ProductNameComparator());
		for (Product product : products) {
			System.out.println(product);
		}

	}
}
