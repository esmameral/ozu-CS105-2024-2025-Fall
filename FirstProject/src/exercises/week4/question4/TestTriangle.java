package exercises.week4.question4;

public class TestTriangle {

	public static void main(String[] args) {
		Triangle tr1=new Triangle();
		tr1.print();
		System.out.println("Area:"+tr1.getArea());
		System.out.println("Perimeter:"+tr1.getPerimeter());
		Triangle tr2=new Triangle(3,4,5);
		tr2.print();
		System.out.println("Area:"+tr2.getArea());
		System.out.println("Perimeter:"+tr2.getPerimeter());
	}

}
