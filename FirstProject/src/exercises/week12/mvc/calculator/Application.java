package exercises.week12.mvc.calculator;

public class Application {
	public static void main(String[] args) {
		Model m = new Model(0,0,0);
		View v = new View("MVC Example");
		Controller c = new Controller(m, v);
		c.initView();
		c.defineEventHandlers();

	}

}
