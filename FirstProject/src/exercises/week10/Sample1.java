package exercises.week10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Sample1 {
	public void method1(int a) {
		
		try {
			method2(a);
		}catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}catch(Exception t) {
			System.out.println(t.toString());
		}
		finally {
			System.out.println("Finally block executed");
		}
	}

	public void method2(int a) throws FileNotFoundException {
		method3(a);
		System.out.println("method 2");
	}

	public void method3(int a) throws FileNotFoundException{ 
		if (a == 2) {
			FileInputStream input = new FileInputStream(new File("file.txt"));
		}
		String name = null;
		System.out.println(name.toUpperCase());
		int[] arr= {1};
		int b=arr[2];

	}
	
}
