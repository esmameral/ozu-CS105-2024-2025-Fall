package exercises.week8;

public class Test {

	public static void main(String[] args) {
		Animal anAnimal= new Animal("Snake");
		Mammal aCat= new Cat("Simba");
//		Dog aDog=new Dog("Merlin");
		Animal anotherCat= new Cat("Karamel");
				
		System.out.println(anAnimal);
		System.out.println(aCat);
//		System.out.println(aDog);
				
		((Cat)aCat).greets();
		((Cat)aCat).climb(5);
//		aDog.greets();
//		aDog.greets(new Dog("Haydut"));


	}

}
