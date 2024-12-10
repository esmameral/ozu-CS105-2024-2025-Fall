package exercises.week12.gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFirstGUI {

	public static void main(String[] args) {
		JFrame f=new JFrame("First GUI Example");
		JButton b=new JButton("Click Me");
		b.setSize(30, 20);
		f.add(b);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
