package exercises.week10.question3;

import java.util.ArrayList;
import java.util.List;

public class TestTrio {

	public static void main(String[] args) {
		Sandwich burger = new Sandwich("Cheeseburger", 30);
		Sandwich chicken = new Sandwich("Chicken Sandwich", 40);
		Salad greenSalad = new Salad("Green Salad", 22);
		Salad cesarSalad = new Salad("Caesar Salad", 35);
		Drink coke = new Drink("Coke", 18);
		Drink juice = new Drink("Orange Juice", 45);
		Trio trio1 = new Trio(burger, greenSalad, coke);
		System.out.println(trio1.getName());
		System.out.println(trio1.getPrice());
		Trio trio2 = new Trio(chicken, cesarSalad, juice);
		System.out.println(trio2.getName());
		System.out.println(trio2.getPrice());
		
		
		
		ArrayList<MenuItem> invoice=new ArrayList<MenuItem>();
		invoice.add(juice);
		invoice.add(trio1);
		invoice.add(chicken);
		double sum=0;
		for (MenuItem menuItem : invoice) {
			sum+=menuItem.getPrice();
		}
		System.out.println("Invoice amount:"+sum);
		

	}

}
