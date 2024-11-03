package exercises.week4.question4;

public class Triangle {
private double side1;
private double side2;
private double side3;

public Triangle() {
	side1=1;
	side2=1;
	side3=1;
}

public Triangle(double s1, double side2, double side3) {
	this.side1 = s1;
	this.side2 = side2;
	this.side3 = side3;
}
public double getArea() {
	double s=(side1+side2+side3)/2;
	return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
}
public double getPerimeter() {
	return side1+side2+side3;
}
public void print() {
	System.out.println("Triangle: side1="+side1+" side2="+side2+" side3="+side3);
}

public double getSide1() {
	return side1;
}
public void setSide1(double side1) {
	this.side1 = side1;
}
public double getSide2() {
	return side2;
}
public void setSide2(double side2) {
	this.side2 = side2;
}
public double getSide3() {
	return side3;
}
public void setSide3(double side3) {
	this.side3 = side3;
}

}
