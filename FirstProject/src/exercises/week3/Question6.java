package exercises.week3;

/**
 * Create the first 20 elements of this array {500.0, 250.0, 125.0, 62.5, 31.25,
 * ….}. The first element is fixed, the next element depends on the previous
 * element. Find out how many of the elements are integers and how many are <1.
 */
public class Question6 {

	public static void main(String[] args) {
		double arr[] = new double[20];
		arr[0] = 500;
		int count = 0;
		for (int i = 1; i < arr.length; i++) {
			arr[i] = arr[i-1] / 2;
			if (arr[i] < 1)
				count++;
		}
		
		System.out.println(count+" elements are <1");
	}

}
