package exercises.week3;

/**
 * Define an int array. If your array contains at least one even number, your
 * program should print "The array contains an even integer", otherwise it
 * should print "No even integers in the array". Hint: when you find an even
 * number you must terminate the loop
 */
public class Question5 {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 41, 5, 6 };
		boolean evenNumberExists=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0) {
				evenNumberExists=true;
				break;
			}
		}
		
		if(evenNumberExists)
			System.out.println("The array contains an even integer");
		else
			System.out.println("No even integers in the array");

	}

}
