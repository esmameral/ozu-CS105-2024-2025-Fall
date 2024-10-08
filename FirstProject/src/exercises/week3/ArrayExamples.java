package exercises.week3;

public class ArrayExamples {

	public static void main(String[] args) {
		int[] numbers= {1,7,4,2,9};//5. index numbers : 0,1,2,3,4
		
		System.out.println(numbers[0]);//1
		System.out.println(numbers[3]);//2
		System.out.println(numbers[4]);//9
		
		System.out.println("numbers[2]:"+numbers[2]);//4
		numbers[2]=14;
		System.out.println("numbers[2]:"+numbers[2]);//14
		
		
		System.out.println("length:"+numbers.length);
		System.out.println("Numbers array values:");
		for (int i = 0; i <numbers.length ; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		
		System.out.println("Numbers array values:");
		for (int number : numbers) {
			System.out.println(number);
		}
		
		
		String names[] = new String[5];//0,1,2,3,4
		//String names[]= {null,"Deniz",null,"Elif","Bilge"}//Same
		names[1]="Deniz";
		names[3]="Elif";
		names[4]="Bilge";
		System.out.println("names array values:");
		for (int i = 0; i <names.length ; i++) {
			System.out.print(names[i]+" ");
		}
		
		for(String ad:names) {
			System.out.println(ad);
		}

	}

}
