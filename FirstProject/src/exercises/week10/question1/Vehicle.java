package exercises.week10.question1;

public class Vehicle {
	private int x;
	private int y ;
	private String color="white";
	private int numberOfDoors;
	private int numberOfTires;
	
	public void moveBy(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	
	public Vehicle(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfTires() {
		return numberOfTires;
	}

	public void setNumberOfTires(int numberOfTires) {
		this.numberOfTires = numberOfTires;
	}

	@Override
	public String toString() {
		return " [x=" + x + ", y=" + y + ", color=" + color + ", numberOfDoors=" + numberOfDoors
				+ ", numberOfTires=" + numberOfTires + "]";
	}
	
	
}
