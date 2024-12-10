package exercises.week12.gui;

import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbsoluteLayout extends JFrame {
	
	public static void main(String[] args) {
		new AbsoluteLayout();
	}

	public AbsoluteLayout() throws HeadlessException {
		setTitle("Layout Examples");
		setSize(300,300);
		JPanel panel=new JPanel();
		panel.setLayout(null);
		
		JButton b1=new JButton("Button1");
		b1.setBounds(80, 10, 100, 40);
		JButton b2=new JButton("Button2");
		b2.setBounds(80, 60, 100, 40);
		
		JButton b3=new JButton("Button3");
		b3.setBounds(80, 110, 100, 40);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	
}
