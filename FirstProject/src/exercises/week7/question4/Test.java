package exercises.week7.question4;

public class Test {

	public static void main(String[] args) {
		Person p1=new Person(123,"Celal");
		Student p2=new Student(112,"Kemal","IE",2022);
		p2.setFee(20000.0);
		Person p3= new Staff(342,"Esra",12500.0);
		p2.setAddress("ANKARA");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

//		Expected Output:
//		I am Celal from ISTANBUL My Info: ID=123
//		I am Kemal from ISTANBUL My Info: ID=112 program=IE, year=2022, fee=20000.0
//		I am Esra from ISTANBUL My Info: ID=342 salary=12500.0


	}

}
