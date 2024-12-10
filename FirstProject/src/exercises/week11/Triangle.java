package exercises.week11;

import java.io.Serializable;

public class Triangle extends Shape implements Printable, Comparable{

	@Override
	public double getArea() {
		return 100;
	}

	@Override
	public void printMe() {
		System.out.println("I am a triangle");
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
