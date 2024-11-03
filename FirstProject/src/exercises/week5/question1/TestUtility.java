package exercises.week5.question1;

public class TestUtility {

	public static void main(String[] args) {
		double[] array = { 1, 4, 5, 23, 12 };
		Utility.printArray(array);

		double[] array2 = Utility.greaterThanAvg(array);
		System.out.println("Greater than average:");
		for (double value : array2) {
			System.out.println(value);
		}
	}

}
