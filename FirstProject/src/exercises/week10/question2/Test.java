package exercises.week10.question2;

public class Test {
public static void main(String[] args) {
	Person p=new Person();
	p.setName("Ahmet");
	System.out.println(p.toString());
	
	Student s=new Student();
	s.setName("Ercan");
	System.out.println(s);
	
	Employee e=new Employee();
	e.setName("Ali");
	System.out.println(e);
	
	Faculty f=new Faculty();
	f.setName("Hasan");
	System.out.println(f);
	
	Staff st=new Staff();
	st.setName("Demet");
	System.out.println(st);
	
}
}
