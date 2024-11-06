package exercises.week3;
/**
 * How to find all pairs on integer array whose sum is equal to given number
 */
public class Question20 {

	public static void main(String[] args) {
		int[] numbers= {1,4,3,5,9,2,0};
		int value=5;
		
		String[] arr=findPairs(numbers,value); 
		for(String aPair:arr) {
			System.out.print(aPair);
		}

	}
	
	public static String[] findPairs(int[] numbers, int value) {
		int count=0;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]+numbers[j]==value)
					count++;
			}
		}
		String[] pairs=new String[count];
		int pairIndex=0;
		for(int i=0;i<numbers.length-1;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]+numbers[j]==value) {
					pairs[pairIndex] ="["+numbers[i]+","+numbers[j]+"]";
					pairIndex++;
				}
			}
		}
		return pairs;
	}
	
	
	

}
