package exercises.week5.question2;

public class Test {
	public static void main(String[] args) {
		int x = 13;
		strange(x);
		System.out.println("x = " + x);
	}

	public static void strange(int x) {
		x++;
		System.out.println("x = " + x);
		x++;
	}

}
