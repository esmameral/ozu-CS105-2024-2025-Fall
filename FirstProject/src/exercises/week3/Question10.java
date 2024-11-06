package exercises.week3;
/**
 * First array : {6,3,9,2,5}
Second array: {13,1,7}
Last Array: {6,3,9,2,5,13,1,7}
Write a program for combining two arrays
 */
public class Question10 {

	public static void main(String[] args) {
		int[] a1= {6,3,9,2,5};
		int[] a2= {13,1,7};
		
		int[] a3=new int[a1.length+a2.length];
		
		for (int i = 0; i < a1.length; i++) {
			a3[i]=a1[i];
		}
		
		for (int i = 0; i < a2.length; i++) {
			a3[a1.length+i]=a2[i];
		}
		
		for (int i : a3) {
			System.out.print(i+ " ");
		}
		
		
	}

}
