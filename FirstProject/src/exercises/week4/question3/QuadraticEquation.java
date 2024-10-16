package exercises.week4.question3;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;
	private double disc;
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.disc=b*b-4*a*c;
	}
	
	public double getRoot1() {
		if(disc>=0) {
			return (-b+Math.sqrt(disc))/(2*a);
		}else{
			return 0;
		}
	}
	public double getRoot2() {
		if(disc>=0) {
			return (-b-Math.sqrt(disc))/(2*a);
		}else{
			return 0;
		}
	}
	public void print() {
		if(disc>0)
			System.out.println("The equation has two roots "+getRoot1()+" and "+getRoot2());
		else if (disc==0)
			System.out.println("The equation has one root "+getRoot1());
		else
			System.out.println("The equation has no real roots");		
	}
	public double getDisc() {
		return disc;
	}
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
	
	public double getC() {
		return c;
	}
	
	

}
