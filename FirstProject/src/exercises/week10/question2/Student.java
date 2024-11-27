package exercises.week10.question2;

public class Student extends Person {
private String status ;

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}
@Override
public String toString() {
	return "Student ["+ getName() + "]";
}
}
