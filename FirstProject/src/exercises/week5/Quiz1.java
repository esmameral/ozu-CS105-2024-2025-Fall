package exercises.week5;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter an integer value");
	boolean saw13=false;
	int N=in.nextInt();
	for (int i = 1; i <= N; i++) {
		int number=(int)(Math.random()*10+10);
		System.out.println("next number:"+number);
		if(number==13)
			saw13=true;
		
	}
	if(saw13)
		System.out.println("We saw at least one 13!");
	else
		System.out.println("No 13 was seen");
}
}
