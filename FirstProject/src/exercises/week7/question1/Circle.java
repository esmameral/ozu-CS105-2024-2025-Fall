package exercises.week7.question1;

import java.util.Objects;

public class Circle {
	private double radius;
	private Point center;

	public Circle(Point centerPoint, double radius) {
		this.radius = radius;
		this.center = centerPoint;
	}

	public String toString() {
		return " the circle C[" + center.getX() + "," + this.center.getY() + "] radius:" + this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public String positionOfPoint(Point p) {
		double distance=Math.sqrt(Math.pow(p.getX()-this.center.getX(),2)+
				Math.pow(p.getY()- this.center.getY(),2));
		
		if(distance==radius)
			return "ON";
		else if(distance>radius)
			return "OUTSIDE";	
		else
			return "INSIDE";
				
	}

	@Override
	public int hashCode() {
		return Objects.hash(center, radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		
		return this.radius==other.radius&&this.center.getX()==other.center.getX()&&this.center.getY()==other.center.getY();
		
		
	}
	
	

}
