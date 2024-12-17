package exercises.week12.mvc.calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import exercises.week12.gui.calculator.ButtonListener;

public class View extends JFrame {

	JTextField number1TextField = new JTextField();
	JTextField number2TextField = new JTextField();

	JLabel labelNumber1 = new JLabel("Number 1:");
	JLabel labelNumber2 = new JLabel("Number 2:");

	JButton addButton = new JButton("+");
	JButton subButton = new JButton("-");
	JButton mulButton = new JButton("*");
	JButton divButton = new JButton("/");
	JLabel resultLbl = new JLabel("Result:");
	JTextField result = new JTextField();
	JButton clearButton = new JButton("Clear");

	public View(String title) {
		setLayout(null);
		setTitle(title);
		labelNumber1.setBounds(40, 70, 70, 20);
		number1TextField.setBounds(110, 70, 70, 20);
		labelNumber2.setBounds(190, 70, 70, 20);
		number2TextField.setBounds(260, 70, 70, 20);

		addButton.setBounds(80, 130, 45, 20);
		subButton.setBounds(130, 130, 45, 20);
		mulButton.setBounds(180, 130, 45, 20);
		divButton.setBounds(230, 130, 45, 20);

		add(labelNumber1);
		getContentPane().add(number1TextField);
		getContentPane().add(labelNumber2);

		getContentPane().add(number2TextField);
		getContentPane().add(addButton);
		getContentPane().add(subButton);
		getContentPane().add(mulButton);
		getContentPane().add(divButton);
		result.setSize(100, 20);
		result.setLocation(160, 170);
		result.setEditable(false);
		getContentPane().add(resultLbl);
		getContentPane().add(result);

		resultLbl.setBounds(100, 170, 49, 20);
		getContentPane().add(resultLbl);

		clearButton.setBounds(160, 211, 89, 23);
		getContentPane().add(clearButton);

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
