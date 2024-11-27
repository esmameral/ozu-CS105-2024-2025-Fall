package exercises.week10.question2;

public class Faculty extends Employee {
	private String officeHours;
	private double rank;
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}
	public double getRank() {
		return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "Faculty ["+ getName() + "]";
	}
}
