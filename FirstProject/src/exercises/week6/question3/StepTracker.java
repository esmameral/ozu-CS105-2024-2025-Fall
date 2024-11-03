package exercises.week6.question3;

public class StepTracker {
	private int target;
	private int totalSteps;
	private int dayCount;
	private int activeDayCount;

	public int getTotalSteps() {
		return totalSteps;
	}

	public StepTracker(int hedef) {
		this.target = hedef;
	}

	public int activeDays() {
		return activeDayCount;
	}

	public void addDailySteps(int dailySteps) {
		this.totalSteps += dailySteps;
		dayCount++;
		if (dailySteps >= target) {
			activeDayCount++;
		}

	}

	public int averageSteps() {
		if (dayCount > 0)
			return totalSteps / dayCount;
		else
			return 0;

	}
}
