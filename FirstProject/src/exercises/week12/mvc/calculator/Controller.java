package exercises.week12.mvc.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
	Model m;
	View v;

	public void initView() {
		v.number1TextField.setText(m.getNumber1() + "");
		v.number2TextField.setText(m.getNumber2() + "");
		v.result.setText(m.getResult() + "");
	}

	public void defineEventHandlers() {
		v.addButton.addActionListener(new ButtonListener(v));
		v.subButton.addActionListener(new ButtonListener(v));
		v.mulButton.addActionListener(new ButtonListener(v));
		v.divButton.addActionListener(new ButtonListener(v));

		v.clearButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				v.number1TextField.setText("");
				v.number2TextField.setText("");
				v.result.setText("");

			}
		});

	}

	public Controller(Model m, View v) {
		super();
		this.m = m;
		this.v = v;
	}

	public Model getM() {
		return m;
	}

	public void setM(Model m) {
		this.m = m;
	}

	public View getV() {
		return v;
	}

	public void setV(View v) {
		this.v = v;
	}

}
