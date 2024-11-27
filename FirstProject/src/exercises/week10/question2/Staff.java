package exercises.week10.question2;

public class Staff extends Employee {
private String title;

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}
@Override
public String toString() {
	return "Staff ["+ getName() + "]";
}
}
