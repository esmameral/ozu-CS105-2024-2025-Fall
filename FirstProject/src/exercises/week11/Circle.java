package exercises.week11;

import exercises.week11.Shape;

public class Circle extends Shape {
	
	public Circle() {
		super();		
	}
	int r=5;
	@Override
	public String getColor() {
		return "Blue";
	}
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}
	
	

}
