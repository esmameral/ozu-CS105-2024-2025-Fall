package exercises.week8.abs;

public class Circle extends Shape{
	private double r;

	@Override
	public double getArea() {
		return Math.PI*Math.pow(r,2);
	}

	public Circle(double r) {
		super();
		this.r = r;
	}

	@Override
	public double getPerimeter() {
		return 2*Math.PI*r;
	}

	@Override
	public String toString() {
		return super.toString()+" Circle [Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
	}
	
	

}
