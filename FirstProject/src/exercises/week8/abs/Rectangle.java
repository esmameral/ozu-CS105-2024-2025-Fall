package exercises.week8.abs;

public class Rectangle extends Shape {
	private double a;
	private double b;

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		
		return a*b;
	}

	@Override
	public double getPerimeter() {
		return 2*(a+b);
	}
	
	@Override
	public String toString() {
		return super.toString()+" Rectangle [Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}

}
