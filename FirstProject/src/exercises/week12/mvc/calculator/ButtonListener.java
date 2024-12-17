package exercises.week12.mvc.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtonListener implements ActionListener {
	View gui;

	public ButtonListener(View gui) {
		super();
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String value1=gui.number1TextField.getText();
		String value2=gui.number2TextField.getText();
		double number1=0;
		double number2=0;
		try {
			number1 = Double.valueOf(value1);
			number2 = Double.valueOf(value2);
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Please enter only integer or double values", "Error",
					JOptionPane.WARNING_MESSAGE);
		}

		
		
		
		
		double result=0;
		if(e.getSource()==gui.addButton) 
			result=number1+number2;
		else if (e.getSource()==gui.subButton)
			result=number1-number2;
		else if (e.getSource()==gui.mulButton)
			result=number1*number2;
		else if (e.getSource()==gui.divButton)
			result=number1/number2;
		
		gui.result.setText(result+"");
	}

}
