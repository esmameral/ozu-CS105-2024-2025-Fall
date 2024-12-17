package exercises.week13;

public class Test {

	public static void main(String[] args) {
		Category cat1=new Category("Electronics", 20);
		Category cat2=new Category("Cloth", 10);
		Category cat3=new Category("Stationary", 1);
		Category cat4=new Category("Food", 8);

		Product prod1=new Product("453",cat1, "Headphones",30);
		Product prod2=new Product("123",cat2, "Men Tshirt",9);
		Product prod3=new Product("384",cat2, "Women Blouse",19);
		Product prod4=new Product("111",cat4, "Coke",2);
		Product prod5=new Product("982",cat4, "Bread",1);
		Product prod6=new Product("309",cat3, "War and Peace",12);
		Product prod7=new Product("344",cat3, "Pencil Set",10);

		Customer custAli=new Customer("Ali Kara", new Address("Street 12","Cekmekoy","IST"), 
		                                                                           "3986182");
		Customer custEda=new Customer("Eda Dernek",new Address("Karadeniz Street", "Maltepe", "IST"),  "9982762");
		custAli.addToShoppingCart(prod2);
		custAli.addToShoppingCart(prod3);
		custAli.addToShoppingCart(prod6);
		custAli.addToShoppingCart(prod4);

		custEda.addToShoppingCart(prod6);
		custEda.addToShoppingCart(prod7);
		custEda.addToShoppingCart(prod1);

		custAli.printInvoice();
		custEda.printInvoice();

	}

}
