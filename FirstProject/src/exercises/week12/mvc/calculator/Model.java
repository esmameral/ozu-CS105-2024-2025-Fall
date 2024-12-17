package exercises.week12.mvc.calculator;

public class Model {
	private double number1=0;
	private double number2=0;
	private double result=0;

	public Model(double number1, double number2, double result) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.result = result;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	
}
