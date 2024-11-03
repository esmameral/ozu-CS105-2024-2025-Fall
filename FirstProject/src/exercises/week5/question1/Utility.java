package exercises.week5.question1;

public class Utility {
	/**
	 * Write a method that takes a one-dimensional array as parameter and prints its
	 * elements on the screen.
	 * 
	 * @param arr
	 */
	public static void printArray(double[] arr) {
		for (double value : arr) {
			System.out.print(value + "   ");
		}
		System.out.println();
	}

	/**
	 * Write a method that takes a one-dimensional array as a parameter and returns
	 * values that are higher than the average in the array.
	 * 
	 * @return
	 */
	public static double[] greaterThanAvg(double[] arr) {
		double sum=0;
		for (double value : arr) {
			sum+=value;
		}
		double avg=sum/arr.length;
		int count=0;
		for (double value : arr) {
			if(value>avg) {
				count++;
			}
		}
		System.out.println("Average:"+avg);
		double[] newArray=new double[count];
		int i=0;
		for (double value : arr) {
			if(value>avg) {
				newArray[i]=value;
				i++;
			}
			
		}
		return newArray;
	}
}
