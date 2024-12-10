package exercises.week8.abs;

public class Square extends Shape {
double a;
	@Override
	public double getArea() {
		
		return a*a;
	}

	@Override
	public double getPerimeter() {
		
		return 4*a;
	}

	@Override
	public String toString() {
		return super.toString()+" Square";
	}

}
