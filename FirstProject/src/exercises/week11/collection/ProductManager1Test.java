package exercises.week11.collection;

public class ProductManager1Test {
public static void main(String[] args) {
	ProductManager1 m=new ProductManager1();
	System.out.println("-----sort by id--------");
	m.sortProductsById();
	System.out.println("-----sort by price--------");
	m.sortProductsByPrice();
	System.out.println("-----sort by name--------");
	m.sortProductsByName();
}
}
