package exercises.week5.question2;

public class TestCircle {

	public static void main(String[] args) {
		Circle c=new Circle(4);
		System.out.println(c.toString());
		
		//Generate 5 random numbers less than 20
		//and create your circle objects which using generated numbers a radius.
		for (int i = 1; i <=5; i++) {
			Circle newCircle=new Circle((int)(Math.random()*19+1));
			System.out.println(newCircle.toString());
		}

		System.out.println("Number of circles:"+Circle.numberOfObjects);
	}

}
