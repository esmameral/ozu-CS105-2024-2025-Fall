package exercises.week2;

public class FindMaxNumber {

	public static void main(String[] args) {
		int a=10, b=20, c=6;
		
		//first way
//		if(a>b && a>c) {
//			System.out.println("Max:"+a);
//		}else if(b>a && b>c) {
//			System.out.println("Max:"+b);
//		}else {
//			System.out.println("Max:"+c);
//		}
		
		//second way
		if(a>b) {
			if(a>c) {
				System.out.println("Max:"+a);
			}else
				System.out.println("Max:"+c);
		}else {
			if(b>c)
				System.out.println("Max:"+b);
			else
				System.out.println("Max:"+c);
		}

	}

}
