package exercises.week5.question2;

public class Circle {
	private double radius;
	private double area;
	private double perimeter;
	public static int numberOfObjects;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	
	public Circle(double radius) {
		super();
		Circle.numberOfObjects++;
		this.radius = radius;
		this.area=Math.PI*Math.pow(radius, 2);
		this.perimeter=2*Math.PI*radius;
	}
	public String toString() {
		return "The area and perimeter of the circle of radius "
				+ radius +" is "+area+" and "
				+ perimeter;
	}
	

}
